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

import com.wenxt.claims.model.LT_CLAIM_PYMT;
import com.wenxt.claims.repository.LtClaimPymtRepository;
import com.wenxt.claims.service.LtClaimPymtService;

@Service
public class LtClaimPymtServiceImpl implements LtClaimPymtService{
	
	@Autowired
	private LtClaimPymtRepository claimPymtrepo;

//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.claimPymt}")
//	private String getallclaimPymt;

	@Override
	public String createClaimPymt(LT_CLAIM_PYMT claimpymt) {

		if (claimPymtrepo.existsById(claimpymt.getCp_TRAN_id())) {
			claimPymtrepo.save(claimpymt);
			return "LT claim payment updated successfully";
		} else {
			claimPymtrepo.save(claimpymt);
			return "LT Claim payment created successfully";
		}
	}

//	@Override
//	public String getAllClaimPymtlist() throws SQLException {
//		String query = "SELECT cp_TRAN_id,cp_ce_TRAN_id,cp_claim_TRAN_id,cp_ref_TRAN_id,cp_srl_no,cp_schd_pymt_dt,cp_paid_dt,cp_lc_paid_amt,cp_fc_paid_amt,cp_appr_flag,cp_appr_dt,cp_appr_uid,cp_INS_id,cp_INS_dt,cp_MOD_uid,cp_MOD_dt,cp_clm_paid_status,cp_claim_rej_reason,cp_accnt_pay_code,cp_ccd_sys_id,cp_set_flag,cp_claim_paid_to,cp_due_date,cp_flex_01,cp_flex_02,cp_flex_03,cp_flex_04,cp_flex_05,cp_paynet_file_gnrtd_yn,cp_pymt_mtd,cp_payee_name FROM lt_claim_pymt";
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
//		List<LT_CLAIM_PYMT> exceptions = claimPymtrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallclaimPymt);
//		response.put("Heading", header);
//		response.put("Data", exceptions);
//
//		return response.toString();
//
//	}
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
	public String getClaimPymtById(Long cp_TRAN_id) {
		LT_CLAIM_PYMT claimpymt = claimPymtrepo.findById(cp_TRAN_id)
				.orElseThrow(() -> new RuntimeException("POL CLAIM PYMT  not found"));

		JSONObject response = new JSONObject(claimpymt);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + cp_TRAN_id + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteClaimPymtByid(Long cp_TRAN_id) {
		try {
			Optional<LT_CLAIM_PYMT> optionalEntity = claimPymtrepo.findById(cp_TRAN_id);

			if (optionalEntity.isPresent()) {
				claimPymtrepo.deleteById(cp_TRAN_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + cp_TRAN_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + cp_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + cp_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}

}
