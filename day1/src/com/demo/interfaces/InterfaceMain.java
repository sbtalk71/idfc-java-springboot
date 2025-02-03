package com.demo.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		
		MyConnection db= new OracleDB();
		
		System.out.println(db.getConnection());
		System.out.println(db.getDbDetails());

		MyConnection.mystaticMethod();
	}

}
