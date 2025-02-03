package com.demo.interfaces;

public class MySQLDB implements MyConnection{

	@Override
	public String getConnection() {
		
		return "MySQL Connected";
	}

	@Override
	public String getDbDetails() {
		
		return "8.1.0";
	}

}
