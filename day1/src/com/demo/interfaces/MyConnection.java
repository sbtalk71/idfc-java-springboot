package com.demo.interfaces;

public interface MyConnection {

	String version="1.0";
	
	public String getConnection();
	public String getDbDetails();
	
	public default String getProductVersion() {
		myprivateMethod();
		return "I am done";
	}
	
	public static void mystaticMethod() {
		System.out.println("Static method in interface..");
	}
	
	private void myprivateMethod() {
		System.out.println("This is a private method in interface");
	}
}
