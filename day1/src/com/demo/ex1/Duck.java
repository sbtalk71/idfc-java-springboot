package com.demo.ex1;

public class Duck {
	public static int duckCount = 0;
	private String name;

	public Duck() {
		duckCount++;
		//this.name = name;
		//this.doIt();
	}

	public static String getDuckDetails() {
		return duckCount + " ";
	}

	public void doIt() {
	System.out.println("Hello duck");
	}
	
	
	static {
		System.out.println("Static block executes..");
	}
}
