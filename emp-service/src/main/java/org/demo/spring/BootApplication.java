package org.demo.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ApplicationContext ctx =SpringApplication.run(BootApplication.class, args);
		
		/*
		 * WriterApp app= (WriterApp)ctx.getBean("writerApp");
		 * 
		 * app.printText("Hello there");
		 */
		
	}

}
