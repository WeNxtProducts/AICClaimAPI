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

		public String getQqacSelectYn() {
			return qqacSelectYn;
		}

		public void setQqacSelectYn(String qqacSelectYn) {
			this.qqacSelectYn = qqacSelectYn;
		}

		public Long getQqacTranId() {
			return qqacTranId;
		}

		public void setQqacTranId(Long qqacTranId) {
			this.qqacTranId = qqacTranId;
		}

		public String getQqacFcSa() {
			return qqacFcSa;
		}

		public void setQqacFcSa(String qqacFcSa) {
			this.qqacFcSa = qqacFcSa;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	    
	    
}


