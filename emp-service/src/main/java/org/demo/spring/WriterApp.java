package org.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WriterApp {
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("plainTextWriter")
	 */
	private Writer writer; 
	
	/*
	 * public WriterApp(Writer writer) { this.writer=writer; }
	 */
	
	

	public void printText(String message) {
		writer.write(message);
	}
}
