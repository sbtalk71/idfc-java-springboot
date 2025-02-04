package com.demo.inheritance;

public record Customer(int customerId, String name, String email) {

	 public Customer(int customerId, String name, String email) {
		if(customerId<10) throw new IllegalArgumentException("customer id invalid");
		this.customerId=customerId;
		this.name=name;
		this.email=email;
	}
	public String email() {
		return "Your email is "+email;
	}
}
