package com.demo.inheritance;

public class RecordsMain {

	public static void main(String[] args) {
		Customer c1= new Customer(1, "Pretham", "pretham@gmail.com");
		
		System.out.println(c1);
		
		System.out.println(c1.name()+" "+c1.customerId());

	}

}
