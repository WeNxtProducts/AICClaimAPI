package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor
public class InsuranceCoverageDTO {
	   @JsonProperty("QQAC_SELECT_YN") 
	    private String qqacSelectYn;

	    @JsonProperty("QQAC_TRAN_ID")
	    private Long qqacTranId;

	    @JsonProperty("QQAC_FC_SA")
	    private String qqacFcSa;  
	    
	    private Integer id;
}


