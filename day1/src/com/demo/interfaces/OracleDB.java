package com.demo.interfaces;

public class OracleDB implements MyConnection{

	@Override
	public String getConnection() {
		
		return "Oracle DB Connected";
	}

	@Override
	public String getDbDetails() {
		
		return "14c";
	}

}
