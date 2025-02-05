package com.demo.exceptions;

public class AgeHandlerMain {

	public static void main(String[] args) {
		int x=0;
		AgeValidator av = new AgeValidator();
		try {
			x=20;
			System.out.println("is age valid :"+av.validate(20));
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(x);
		}finally {
			System.out.println("Finally block executes.."+x);
		}

	}

}
