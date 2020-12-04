package com.src;

public class Triangle extends Shape {
	
	int base,height;
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void computeArea(int base, int height) {
		System.out.println(0.5 * base * height);
	}

}
