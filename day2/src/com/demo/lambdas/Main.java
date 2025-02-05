package com.demo.lambdas;

public class Main {

	public static void main(String[] args) {
		
		Greeter greeter= new Greeter();
		
		greeter.greet(new GoodMorning());
		
		//using lambda
		GreetMessage msg1=()->"Good Evening";
		
		greeter.greet(msg1);
		
		greeter.greet(()->"Good night");
		
		
		Greeter2 g2= new Greeter2();
		g2.greet(()->"Hello");

	}

}

class GoodMorning implements GreetMessage{
	@Override
	public String getMessage() {
	
		return "Good Morning";
	}
}