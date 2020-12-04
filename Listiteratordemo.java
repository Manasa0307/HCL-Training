package com.src;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++)

		{
			al.add(i);
		}
		System.out.println(al);
		ListIterator lit = al.listIterator();
		while (lit.hasNext()) {
			Integer i = (Integer) lit.next();
			if (i == 5)
				lit.remove();
		}
		System.out.println(al.contains(2));

	}

}
