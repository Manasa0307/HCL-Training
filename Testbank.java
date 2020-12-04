package com.src;

import java.util.*;

public class Testbank {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("enter your choice");
		Scanner s = new Scanner(System.in);
		int ch;
		ch = s.nextInt();
		switch (ch) {
		case 1:
			Axisbank a = new Axisbank();
			a.duration();
			a.amount();
			break;
		case 2:
			Hdfcbank h = new Hdfcbank();
			h.duration();
			h.amount();
			break;
		case 3:
			Icici i = new Icici();
			i.duration();
			i.amount();
			break;
		}
	}

}
