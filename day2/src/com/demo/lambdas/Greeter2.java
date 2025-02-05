package com.demo.lambdas;

import java.util.function.Supplier;

public class Greeter2 {

	public void greet(Supplier<String> message) {
		System.out.println(message.get());
	}
}
