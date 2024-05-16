package com.wenxt.claims.serviceImpl;

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

import com.wenxt.claims.model.LT_CLAIM_ESTIMATE;
import com.wenxt.claims.repository.LtClaimEstimateRepository;
import com.wenxt.claims.service.LtClaimEstimateService;

@Service
public class LtClaimEstimateServiceImpl implements LtClaimEstimateService{
	
	@Autowired
	private LtClaimEstimateRepository claimEstrepo;
//
//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.ltclaimEST}")
//	private String getallltClaimeEST;

	@Override
	public String createLtClaimEst(LT_CLAIM_ESTIMATE ltclaimest) {

		if (claimEstrepo.existsById(ltclaimest.getCcd_TRAN_id())) {
			claimEstrepo.save(ltclaimest);
			return "Lt claim estimate updated successfully";
		} else {
			claimEstrepo.save(ltclaimest);
			return "LT Claim Estimate created successfully";
		}
	}

//	@Override
//	public String getAllLtClaimEstlist() throws SQLException {
//		String query = "SELECT ce_TRAN_id, ce_claim_TRAN_id, ce_est_setl_unit, ce_est_no_of_units, ce_lc_est_amt, ce_fc_est_amt, ce_lc_prem_os, ce_fc_prem_os, ce_lc_loan_os, ce_fc_loan_os, ce_lc_loan_int, ce_fc_loan_int, ce_lc_acc_profit, ce_fc_acc_profit, ce_lc_net_est_amt, ce_fc_net_est_amt, ce_act_setl_unit, ce_act_no_of_units, ce_setl_start_dt, ce_lc_paid_amt, ce_fc_paid_amt, ce_ref_no, ce_remarks, ce_frz_flag, ce_close_flag, ce_INS_id, ce_INS_dt, ce_MOD_id, ce_MOD_dt, ce_lc_prem_os_int, ce_fc_prem_os_int, ce_unit_lc_amt, ce_unit_fc_amt, ce_unpaid_prem_flag, ce_total_chrg_amt, ce_cash_back_fc_value, ce_cash_back_lc_value, ce_fc_excess_amt, ce_lc_excess_amt, ce_asst_sepr_pup_amt, ce_asst_sepr_new_sa, ce_asst_sepr_bon FROM lt_claim_estimate";
//
//		
//		
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
//		List<LT_CLAIM_ESTIMATE> exceptions = claimEstrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallltClaimeEST);
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

	@Override
	public String getLtClaimEstById(Long ce_TRAN_id) {
		LT_CLAIM_ESTIMATE polchager = claimEstrepo.findById(ce_TRAN_id)
				.orElseThrow(() -> new RuntimeException("POL CLAIM EST  not found"));

		JSONObject response = new JSONObject(polchager);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + ce_TRAN_id + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteLtClaimEstByid(Long ce_TRAN_id) {
		try {
			Optional<LT_CLAIM_ESTIMATE> optionalEntity = claimEstrepo.findById(ce_TRAN_id);

			if (optionalEntity.isPresent()) {
				claimEstrepo.deleteById(ce_TRAN_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + ce_TRAN_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + ce_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + ce_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}

}
