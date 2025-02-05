package com.demo.exceptions;

public class AgeValidator {

	public boolean validate(int age) {
		try {
		if(age<18) {
			throw new InvalidAgeException("invalid age");
		}else {
			return true;
		}
		}catch (InvalidAgeException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
