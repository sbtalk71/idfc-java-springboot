package org.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class DecoratedWriter implements Writer{

	@Override
	public void write(String message) {
		System.out.println("Decorated Writer : "+message);
		
	}

}
