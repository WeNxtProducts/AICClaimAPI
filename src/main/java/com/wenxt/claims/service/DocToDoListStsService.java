package com.wenxt.claims.service;

import com.wenxt.claims.model.SaveDocToDoList;

public interface DocToDoListStsService {

	String saveStatus(SaveDocToDoList saveDocListRequest);

	String updateStatus(SaveDocToDoList saveDocListRequest);

}
