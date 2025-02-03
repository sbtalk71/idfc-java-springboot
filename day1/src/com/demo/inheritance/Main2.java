package com.demo.inheritance;

public class Main2 {

	public static void main(String[] args) {
		Employee e= new Employee(100, "Ranga", 56000);
		
		//System.out.println(e.getDetails());
		
		TraineeEmployee te = new TraineeEmployee(100, "Ranga", 56000, "good");
		
		//System.out.println(te.getDetails());
		
		
		Person p= e;
		
		 System.out.println(p.getDetails());
		 
		 p=te;
		 System.out.println(p.getDetails());

	}

}
