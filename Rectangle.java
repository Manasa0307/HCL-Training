package com.src;

public class Rectangle extends Shape {
	int length,breadth;
	

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public void computeArea(int length, int breadth) {
		System.out.println(length * breadth);
	}

	
}
