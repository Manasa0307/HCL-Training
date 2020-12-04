package com.src;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {

		int ch;
		 int radius;
		 System.out.println("enter your choice");
		Scanner s = new Scanner(System.in);
		ch = s.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("enter radius");
			//int radius;
			radius = s.nextInt();
			Circle c=new Circle(radius);
			c.computeArea(radius);
			break;
		case 2:
			System.out.println("enter length and breadth");
			int length, breadth;
			length = s.nextInt();
			breadth = s.nextInt();
			Rectangle r=new Rectangle(length,breadth); 
			r.computeArea(length, breadth);
			break;
		case 3:
			System.out.println("enter base and height");
			int base, height;
			base = s.nextInt();
			height = s.nextInt();
			Triangle t=new Triangle(base,height);
			t.computeArea(base, height);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}