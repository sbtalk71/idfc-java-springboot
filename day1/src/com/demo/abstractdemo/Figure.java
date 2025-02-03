package com.demo.abstractdemo;

public abstract class Figure {
	protected int dim1;
	protected int dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public abstract double area();
	
	public void test() {
		System.out.println("this is just a test..");
	}
}
