package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.BrokerResult;
import com.wenxt.claims.model.BrokerResultDTO;
import com.wenxt.claims.model.FormFieldsDTO;
import com.wenxt.claims.model.LT_POL_BROKER;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolBrokerRepository;
import com.wenxt.claims.service.LtPolBrokerService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtPolBrokerServiceImpl implements LtPolBrokerService {
	
	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;
	
	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;	
		
	@Autowired
	private LtPolBrokerRepository polBrokerRepo;

	@Override
	public String createPolBroker(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POL_BROKER polBroker = new LT_POL_BROKER();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			for(FormFieldsDTO formFieldsDTO : proposalEntryRequest.getPolBrokerDetails()) {
				polBroker = new LT_POL_BROKER();
				fieldMaps = new HashMap<>();
			if(formFieldsDTO != null) {
			fieldMaps.put("frontForm", formFieldsDTO.getFormFields());
			}
			
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolBrokerFields(polBroker, entry.getValue());
			}

				polBroker.setPBRK_INS_DT(new Date(System.currentTimeMillis()));
				polBroker.setPBRK_POL_TRAN_ID(tranId);
				LT_POL_BROKER savedPolBrokerDetails = polBrokerRepo.save(polBroker);
			}
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Pol Broker Details Created Successfully");
				response.put(dataCode, data);
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setPolBrokerFields(LT_POL_BROKER polBroker, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolBrokerField(polBroker, entry.getKey(), entry.getValue());
		}
	}

	private void setPolBrokerField(LT_POL_BROKER polBroker, String key, String value)throws Exception {
		try {
			Field field = LT_POL_BROKER.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_POL_BROKER.class.getMethod(setterMethodName, fieldType);
				setter.invoke(polBroker, convertedValue);
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
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Long.class) && value.isEmpty() == false && value != null) {
			return Long.parseLong(value);
		} else if (fieldType.equals(BigDecimal.class) && value.isEmpty() == false && value != null) {
			BigDecimal bigDecimal = new BigDecimal(value);
			Object obj = bigDecimal;
			return bigDecimal;
		} else {
			return value;
		}
	}
	
	private Object dateTimeConverter(String dateString, Class<?> type){
		SimpleDateFormat dateFormat;
		if (type.equals(Date.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		} else if (type.equals(Timestamp.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			throw new IllegalArgumentException("Unsupported date type: " + type);
		}
 
		try {
			Date parsedDate = (Date) dateFormat.parse(dateString);
			if (type.equals(Date.class)) {
				return type.cast(parsedDate);
			} else if (type.equals(Timestamp.class)) {
				return type.cast(new Timestamp(parsedDate.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		return null;
	}

	@Override
	public String updatePolBroker(ProposalEntryRequest proposalEntryRequest) {
		JSONObject response = new JSONObject();

		try {
//			List<LT_POL_BROKER> brokerList = polBrokerRepo.findByPolId(polBrokerId);
			Optional<LT_POL_BROKER> polBroker = Optional.ofNullable(new LT_POL_BROKER());
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			for (FormFieldsDTO formFieldsDTO : proposalEntryRequest.getPolBrokerDetails()) {
				if (formFieldsDTO.getFormFields().get("PBRK_TRAN_ID") != null) {
					polBroker = polBrokerRepo
							.findById(Integer.parseInt(formFieldsDTO.getFormFields().get("PBRK_TRAN_ID")));
					LT_POL_BROKER polbroker = polBroker.get();
					fieldMaps = new HashMap<>();
					if (polbroker != null) {
						fieldMaps.put("frontForm", formFieldsDTO.getFormFields());
						for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
							setPolBrokerFields(polbroker, entry.getValue());
						}

						polbroker.setPBRK_MOD_DT(new Date(System.currentTimeMillis()));
						LT_POL_BROKER savedPolBrokerDetails = polBrokerRepo.save(polbroker);
					}
				} else {
					LT_POL_BROKER polbroker = new LT_POL_BROKER();
					for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
						setPolBrokerFields(polbroker, entry.getValue());
					}

					polbroker.setPBRK_INS_DT(new Date(System.currentTimeMillis()));
					LT_POL_BROKER savedPolBrokerDetails = polBrokerRepo.save(polbroker);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Pol Broker Details Updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String deletePolBrokerById(Integer polBrokerId, Integer parentId) {
		try {
			Optional<LT_POL_BROKER> polBrokerDetails = polBrokerRepo.findById(polBrokerId);
			Optional<LT_POL_BROKER> parentDetails = polBrokerRepo.findById(parentId);
			if (polBrokerDetails.isPresent() && parentDetails.isPresent()) {
				polBrokerRepo.deleteById(polBrokerId);
				polBrokerRepo.deleteById(parentId);
				
				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + polBrokerId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + polBrokerId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + polBrokerId + ": " + e.getMessage());
			return response.toString();
		}
	}
	
	@Override
	public String getPolBrokerById(Integer polBrokerId, HttpServletRequest request) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		JSONObject innerObject = new JSONObject();
		JSONObject outerObject = new JSONObject();
		JSONObject result = new JSONObject();
		List<JSONObject> resultList = new ArrayList<>();
		List<LT_POL_BROKER> brokerList = polBrokerRepo.findByPolId(polBrokerId);
//		for (LT_POL_BROKER broker : brokerList) {
//			LT_POL_BROKER polBroker = broker;
//			if (polBroker != null) {
//				inputObject = new JSONObject();
//				for (int i = 0; i < polBroker.getClass().getDeclaredFields().length; i++) {
//					innerObject = new JSONObject();
//					Field field = polBroker.getClass().getDeclaredFields()[i];
//					field.setAccessible(true);
//					String columnName = null;
//					if (field.isAnnotationPresent(Column.class)) {
//						Annotation annotation = field.getAnnotation(Column.class);
//						Column column = (Column) annotation;
//						Object value = field.get(polBroker);
//						columnName = column.name();
//						inputObject.put(columnName, value);
//					}
//				}
//				innerObject.put("formFields", inputObject);
//				resultList.add(innerObject);
//			}
//		}
		
//		BrokerResultDTO brokerResult = new BrokerResultDTO();
//		BrokerResult bResult = new BrokerResult();
//		List<BrokerResult> brokerResults = new ArrayList<>();
//		List<LT_POL_BROKER> childerns = new ArrayList<>();
//		for (LT_POL_BROKER data : brokerList) {       //rank Code Used to describe the levels 
//			if (data.getPBRK_PARENT_CODE() != null) { //hierarchy used to describe which agent has which manager and so On
//				LT_POL_BROKER brok = data;
//				bResult = new BrokerResult();
//				childerns = new ArrayList<>();
//					for(LT_POL_BROKER child : brokerList) {
//						if(child.getPBRK_BRK_CODE() != null && child.getPBRK_BRK_CODE().equals(data.getPBRK_PARENT_CODE())) {
//							childerns.add(child);
//						}
//					}
//					brok.setChildren(childerns);
//					bResult.setFormFields(brok);
//					brokerResults.add(bResult);
//
//			}
//		}
//
//		brokerResult.setPolBrokerDetails(brokerResults);
//
//		JSONObject newJ = new JSONObject(brokerResult);
//		result.put(statusCode, successCode);
//		result.put(messageCode, "Pol Broker Details Fetched Successfully");
////		outerObject.put("polBrokerDetails", resultList);
//		result.put(dataCode, newJ);
		
//		System.out.println(brokerList.size());
		
		List<LT_POL_BROKER> agentList = brokerList.stream().filter(i -> i.getPBRK_AGENT_RANK_CODE().equals("01"))
				.collect(Collectors.toList());
		
		
		BrokerResultDTO brokerResultDto = new BrokerResultDTO();
		BrokerResult brokerResult = new BrokerResult();
		List<BrokerResult> brokerLists = new ArrayList<>();
		for(LT_POL_BROKER agent : agentList) {
			LT_POL_BROKER agentData = agent;
			brokerResult = new BrokerResult();
			List<LT_POL_BROKER> hierarchies = brokerList.stream().filter(i -> i.getPBRK_AGENT_HIERARCHY().equals(agent.getPBRK_AGENT_HIERARCHY()) && 
					i.getPBRK_TRAN_ID() != agent.getPBRK_TRAN_ID()).collect(Collectors.toList());
			if(hierarchies.size() > 1) {
				try {
				LT_POL_BROKER brk = setChildrenHierarchy(hierarchies, agentData);
//				agentData.setChildren(hierarchies);
				brokerResult.setFormFields(brk);
				brokerLists.add(brokerResult);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				agentData.setChildren(hierarchies);
				brokerResult.setFormFields(agentData);
				brokerLists.add(brokerResult);
			}
		}
		brokerResultDto.setPolBrokerDetails(brokerLists);
		
		JSONObject newJ = new JSONObject(brokerResultDto);
		result.put(statusCode, successCode);
		result.put(messageCode, "Pol Broker Details Fetched Successfully");
		result.put(dataCode, newJ);
		return result.toString();
	}
	
	public static LT_POL_BROKER setChildrenHierarchy(List<LT_POL_BROKER> hierarchies, LT_POL_BROKER agentData) {
		
		if(hierarchies.size() == 1) {
//			System.out.println("IN 1: " + agentData.getPBRK_BRK_CODE());
			agentData.setChildren(hierarchies);
			return agentData;
			
		}
		
		LT_POL_BROKER[] agentHolder = new LT_POL_BROKER[1];
		Integer fromAgentRank = Integer.parseInt(agentData.getPBRK_AGENT_RANK_CODE());
//		System.out.println("RANK: " + fromAgentRank);
		String toAgnetRank = "0" + (fromAgentRank+1);
//		System.out.println("TORANK: " + toAgnetRank);
//		List<LT_POL_BROKER> childHierarchies = hierarchies.stream().filter(i -> !i.getPBRK_AGENT_RANK_CODE().equals(toAgnetRank))
//				 .peek(i -> { 
//					 System.out.println(i.getPBRK_BRK_CODE() + " " + i.getPBRK_AGENT_RANK_CODE());
//					 if(i.getPBRK_AGENT_RANK_CODE().equals(toAgnetRank)) {
//						 System.out.println("IF");
//						 agentHolder[0] = i;
//					 }
//				    }).collect(Collectors.toList());
		
		List<LT_POL_BROKER> childHierarchies = hierarchies.stream().peek(i -> { 
	        if (i.getPBRK_AGENT_RANK_CODE().equals(toAgnetRank)) {
	            agentHolder[0] = i; 
	        }
	    })
	    .filter(i -> !i.getPBRK_AGENT_RANK_CODE().equals(toAgnetRank))
	    .collect(Collectors.toList());
//		System.out.println("CHILDHIERARCHIES: " + childHierarchies.size());
//		agentData.setChildren(agentHolder[0]);
		if(childHierarchies.size() != 0) {
//			System.out.println("RECURSIVE CALL");
			agentHolder[0].setChildren(setChildrenHierarchy(childHierarchies, agentHolder[0]).getChildren());
		}
		agentData.setChildren(agentHolder[0]);
		return agentData;
		    
//		    // Base case: If no more child hierarchies, return the agentData
//		    if (hierarchies.isEmpty()) {
//		        return agentData;
//		    }
//
//		    // Mutable holder for the next agent in the hierarchy
//		    LT_POL_BROKER[] agentHolder = new LT_POL_BROKER[1];
//		    
//		    // Get current agent's rank and the next rank to look for
//		    Integer fromAgentRank = Integer.parseInt(agentData.getPBRK_AGENT_RANK_CODE());
//		    String toAgentRank = "0" + (fromAgentRank + 1); // Rank for the next hierarchy level
//		    
//		    // Find child hierarchies and identify the next agent in the hierarchy
//		    List<LT_POL_BROKER> childHierarchies = hierarchies.stream()
//		        .peek(i -> { 
//		            if (i.getPBRK_AGENT_RANK_CODE().equals(toAgentRank)) {
//		                agentHolder[0] = i; // Set the next agent in the hierarchy
//		            }
//		        })
//		        .filter(i -> !i.getPBRK_AGENT_RANK_CODE().equals(toAgentRank)) // Exclude the found agent
//		        .collect(Collectors.toList());
//		    
//		    // If the next agent (agentHolder[0]) is found, set its children recursively
//		    if (agentHolder[0] != null) {
//		        // Recursively call setChildrenHierarchy for the remaining hierarchy
//		        agentHolder[0].setChildren(setChildrenHierarchy(childHierarchies, agentHolder[0]).getChildren());
//		    }
//		    
//		    // Set the children to the current agent
//		    agentData.setChildren(Collections.singletonList(agentHolder[0])); // Add the agent as a single child
//		    
//		    return agentData;
		
	}

}
