package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import com.wenxt.claims.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

	@Override
	public void setFields(Object instance, Class<?> clazz, Map<String, String> value) throws Exception{
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setField(instance, clazz, entry.getKey(), entry.getValue());
		}
	}

	private void setField(Object instance, Class<?> clazz, String key, String value) throws Exception{
		try {
			Field field = clazz.getDeclaredField(key);
				field.setAccessible(true);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = clazz.getMethod(setterMethodName, fieldType);
				setter.invoke(instance, convertedValue);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	private Object convertStringToObject(String value, Class<?> fieldType) {
		if (fieldType.equals(Integer.class) && value.isEmpty() == false && value != null) {
			return Integer.parseInt(value);
		} else if (fieldType.equals(Double.class) && value.isEmpty() == false && value != null) {
			return Double.parseDouble(value);
		} else if (fieldType.equals(Short.class) && value.isEmpty() == false && value != null) {
			return Short.parseShort(value);
		} else if (fieldType.equals(LocalDateTime.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateConverter(value);
		} else if (fieldType.equals(Long.class) && value.isEmpty() == false && value != null) {
			return Long.parseLong(value);
		} else if (fieldType.equals(BigDecimal.class) && value.isEmpty() == false && value != null) {
			return new BigDecimal(value);
		} else {
			return value;
		}
	}

	public Object dateConverter(String value) {
		String dateStr = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = (Date) sdf.parse(dateStr);
		} catch (ParseException | java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

	private Object dateTimeConverter(String value) {
		String dateString = value;
		if (value.length() > 10) {
			dateString = value.substring(0, 10);
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalTime defaultTime = LocalTime.of(0, 0, 0);
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		LocalDateTime dateTime = LocalDateTime.of(localDate, defaultTime);
		String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatters);
		return parsedDateTime;
	}

}

