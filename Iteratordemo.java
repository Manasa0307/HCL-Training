package com.src;

import java.util.*;

public class Iteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		ListIterator itr = (ListIterator) al.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();
			System.out.println(n);
		}			System.out.println(al);
	System.out.println(al.remove(5));
	
	
	}
}

