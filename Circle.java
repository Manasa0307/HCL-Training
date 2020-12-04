package com.src;

public class Circle extends Shape {
	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void computeArea(int radius) {
		System.out.println(radius * radius);
	}

	
}
