package com.demo.abstractdemo;

public class FigureMain {

	public static void main(String[] args) {
		Figure ref;
		
		ref=new Triangle(20, 10);
		
		System.out.println(ref.area());
		
		ref=new Rectangle(20, 10);
				
		System.out.println(ref.area());
		ref.test();

	}

}
