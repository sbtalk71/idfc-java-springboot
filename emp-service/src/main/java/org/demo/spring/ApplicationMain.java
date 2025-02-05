package org.demo.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WriterApp app= (WriterApp)ctx.getBean("writerApp");
		
		app.printText("Hello there");

	}

}
