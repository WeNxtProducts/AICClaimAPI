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

import com.example.aicbaseCrud.model.LT_CLAIM_CHARGES;
import com.example.aicbaseCrud.repository.LtClaimChargesRepository;
import com.example.aicbaseCrud.service.LtClaimChargesService;

@Service
public class LtClaimChargesServiceImpl implements LtClaimChargesService {
	
	@Autowired
	private LtClaimChargesRepository ltclaimChrgsrepo;

//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.claimChgrs}")
//	private String getallclaimChgrs;

	@Override
	public String createClaimCharges(LT_CLAIM_CHARGES ltclaimChrgs) {
		if (ltclaimChrgsrepo.existsById(ltclaimChrgs.getCc_TRAN_id())) {
			ltclaimChrgsrepo.save(ltclaimChrgs);
			return "Lt claim  Beneficiary updated successfully";
		} else {
			ltclaimChrgsrepo.save(ltclaimChrgs);
			return "LT Claim Beneficiary  created successfully";
		}
	}

//	@Override
//	public String getAllClaimChargeslist() throws SQLException {
//		String query = "SELECT cben_TRAN_id,cben_claim_TRAN_id,cben_cp_TRAN_id,cben_pben_TRAN_id,cben_bnf_type,cben_relation_code,cben_bnf_name,cben_bnf_name_bl,cben_perc,cben_INS_id,cben_INS_dt,cben_MOD_id,cben_MOD_dt,cben_lc_paid_amt,cben_fc_paid_amt,cben_bank_code,cben_acct_code,cben_ref_id1,cben_ref_id2,cben_address1,cben_address2,cben_address3,cben_stat_code,cben_postal_code,cben_city_code,cben_address4,cben_address5,cben_remarks,cben_catg_code,cben_age,cben_guardian_name,cben_micr_code,cben_divn_code,cben_sr_no,cben_dob,cben_bnf_code,cben_flex_01,cben_flex_02,cben_flex_03,cben_flex_04,cben_flex_05,cben_flex_06 FROM lt_claim_beneficiary";
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
//		List<LT_CLAIM_CHARGES> exceptions = ltclaimChrgsrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallclaimChgrs);
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

	@Override
	public String getClaimChargesById(Long cc_TRAN_id) {
		LT_CLAIM_CHARGES claimcharges = ltclaimChrgsrepo.findById(cc_TRAN_id)
				.orElseThrow(() -> new RuntimeException("claim beneficiary not found"));

		JSONObject response = new JSONObject(claimcharges);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + cc_TRAN_id + " retrived successfully");
		return response.toString();
	}

	@Override
	public String deleteClaimChargesByid(Long cc_TRAN_id) {
		try {
			Optional<LT_CLAIM_CHARGES> optionalEntity = ltclaimChrgsrepo.findById(cc_TRAN_id);

			if (optionalEntity.isPresent()) {
				ltclaimChrgsrepo.deleteById(cc_TRAN_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + cc_TRAN_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + cc_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + cc_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}

}
