package com.demo.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;

			double d = a / b;
			int[] nums=new int[5];
			//System.out.println(nums[5]);
			
			String s=null;
			s.length();
			
			System.out.println("No Exceptions");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Normal execution resumed..");

	}

	
}
