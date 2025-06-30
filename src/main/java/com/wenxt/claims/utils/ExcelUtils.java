package com.wenxt.claims.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtils {

    public static String getCellAsString(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null) return null;

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getLocalDateTimeCellValue().toLocalDate().toString();
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
            case _NONE:
            case ERROR:
            default:
                return null;
        }
    }

    public static Integer getCellAsInteger(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null || cell.getCellType() == CellType.BLANK) return null;

        try {
            if (cell.getCellType() == CellType.NUMERIC) {
                return (int) cell.getNumericCellValue();
            } else if (cell.getCellType() == CellType.STRING) {
                String value = cell.getStringCellValue().trim();
                return value.isEmpty() ? null : Integer.parseInt(value);
            }
        } catch (Exception e) {
            System.err.println("Failed to parse integer at cell " + index);
        }

        return null;
    }

    public static Double getCellAsDouble(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null || cell.getCellType() == CellType.BLANK) return null;

        try {
            if (cell.getCellType() == CellType.NUMERIC) {
                return cell.getNumericCellValue();
            } else if (cell.getCellType() == CellType.STRING) {
                String value = cell.getStringCellValue().trim();
                return value.isEmpty() ? null : Double.parseDouble(value);
            }
        } catch (Exception e) {
            System.err.println("Failed to parse double at cell " + index);
        }

        return null;
    }

    public static LocalDate getCellAsLocalDate(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null || cell.getCellType() == CellType.BLANK) return null;

        try {
            if (DateUtil.isCellDateFormatted(cell)) {
                Date date = cell.getDateCellValue();
                return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } else if (cell.getCellType() == CellType.STRING) {
                return LocalDate.parse(cell.getStringCellValue().trim());
            }
        } catch (Exception e) {
            System.err.println("Failed to parse LocalDate at cell " + index);
        }

        return null;
    }
    
    public static String getCellAsDateString(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null || cell.getCellType() == CellType.BLANK) return null;

        try {
            if (DateUtil.isCellDateFormatted(cell)) {
            	System.out.println("IF");
            	try {
            		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String dateStr = getCellAsString(row, 5); // e.g. "1995-07-09"
					Date date = sdf.parse(dateStr);
					return sdf.format(date);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                } // returns java.util.Date
            } else if (cell.getCellType() == CellType.STRING) {
            	try {
            		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String dateStr = getCellAsString(row, 5); // e.g. "1995-07-09"
					Date date = sdf.parse(dateStr);
					return sdf.format(date);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        } catch (Exception e) {
            System.err.println("Failed to parse Date at cell " + index);
        }

        return null;
    }

    public static BigDecimal getCellAsBigDecimal(Row row, int index) {
        Double value = getCellAsDouble(row, index);
        return value != null ? BigDecimal.valueOf(value) : null;
    }
}
