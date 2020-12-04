package com.src;

import java.util.*;

public class Stallmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ch;
		String name;
		String detail;
		String ownerName;
		String stalltype;
		int size;
		Scanner s = new Scanner(System.in);
		ch = s.nextBoolean();
		name = s.next();
		detail = s.next();
		ownerName = s.next();
		int noftv;
		noftv = s.nextInt();
		Stall obj = new Stall(name, detail, ownerName);
	}
}