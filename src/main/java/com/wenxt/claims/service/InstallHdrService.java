package com.wenxt.claims.service;

import com.wenxt.claims.model.ReceiptRequest;

public interface InstallHdrService {

	String save(ReceiptRequest receiptRequest);

	String update(ReceiptRequest receiptRequest, Integer tranId);

	String delete(Integer tranId);

	String get(Integer tranId);

}
