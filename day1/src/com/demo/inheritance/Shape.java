package com.demo.inheritance;

import java.awt.Rectangle;

public sealed class Shape permits Circle,Square{

}

 non-sealed class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
}

 non-sealed class Square extends Shape {
	private int length;

	public Square(int length) {
		this.length = length;
	}
}

/*
 * class Dog extends Shape{
 * 
 * 
 * }
 */
