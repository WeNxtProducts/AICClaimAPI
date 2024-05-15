package com.example.aicbaseCrud.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.aicbaseCrud.model.LT_CLAIM;
import com.example.aicbaseCrud.repository.LtClaimRepository;
import com.example.aicbaseCrud.service.LtClaimService;

@Service
public class LtClaimServiceImpl implements LtClaimService{

	@Autowired
	private LtClaimRepository ltclaimrepo;

//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.ltclaim}")
//	private String getallltClaim;

	@Override
	public String createLtClaim(LT_CLAIM ltclaim) {

		if (ltclaimrepo.existsById(ltclaim.getClaim_TRAN_id())) {
			ltclaimrepo.save(ltclaim);
			return "Lt claim updated successfully";
		} else {
			ltclaimrepo.save(ltclaim);
			return "LT Claim created successfully";
		}
	}

//	@Override
//	public String getAllLtClaimlist() throws SQLException {
//		String query = "SELECT claim_TRAN_id,claim_pol_TRAN_id,claim_pol_no,claim_ds_code,claim_poad_serial_no,claim_assr_code,claim_curr_code,claim_exch_rate,claim_loss_dt,claim_intm_dt,claim_no,claim_type,claim_remarks,claim_ref_no,claim_pay_to,claim_close_flag,claim_status,claim_frz_flag,claim_INS_id,claim_INS_dt,claim_MOD_id,claim_MOD_dt,claim_cust_code,claim_accnt_pay_code,claim_addl_status,claim_rev_res_flag,claim_resv_amt,claim_util_amt,claim_apprv_dt,claim_apprv_status,claim_unit_sell_yn,claim_reopen_dt,claim_reopen_reason,claim_pol_valid_yn,claim_med_code,claim_lc_rla_amount,claim_pci_ref_no,claim_lc_wak_amt,claim_lc_serv_fee,claim_lc_risk_prem,claim_dis_cert_dt,claim_med_exp_dt,claim_sickness_dt,claim_excl_typ,claim_excl_reason,claim_memb_code,claim_diseases_code,claim_diseases_remarks,claim_assrd_ref_id1,claim_fee_hospitals,claim_icd_diseases_dtl,claim_hosp_addm_dt,claim_hosp_dschg_dt,clm_excl_yn,claim_claimant_code,claim_int_email,claim_int_mobile,claim_pay_method,claim_pay_rate FROM lt_claim";
//		ResultSet headerResultSet = executeQuery(query);
//
//		JSONObject header = new JSONObject();
//		ResultSetMetaData rsmd = headerResultSet.getMetaData();
//		int columnCount = rsmd.getColumnCount();
//		for (int i = 1; i <= columnCount; i++) {
//			String columnName = rsmd.getColumnName(i);
//			header.put(columnName, columnName);
//		}
//
//		List<LT_CLAIM> exceptions = ltclaimrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallltClaim);
//		response.put("Heading", header);
//		response.put("Data", exceptions);
//
//		return response.toString();
//
//	}
//
//	private ResultSet executeQuery(String query) throws SQLException {
//		try {
//			// Load the MySQL JDBC driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		// Establish a connection
//		Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
//
//		// Create a statement
//		Statement statement = connection.createStatement();
//
//		// Execute the query and return the result set
//		return statement.executeQuery(query);
//	}
//
//
	@Override
	public String getLtClaimById(Long claim_TRAN_id) {
		LT_CLAIM polchager = ltclaimrepo.findById(claim_TRAN_id)
				.orElseThrow(() -> new RuntimeException("POL CHARGER not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + claim_TRAN_id + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteLtClaimByid(Long claim_TRAN_id) {
		try {
			Optional<LT_CLAIM> optionalEntity = ltclaimrepo.findById(claim_TRAN_id);

			if (optionalEntity.isPresent()) {
				ltclaimrepo.deleteById(claim_TRAN_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + claim_TRAN_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + claim_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + claim_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}

}
