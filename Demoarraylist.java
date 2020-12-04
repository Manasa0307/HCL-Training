package com.src;
import java.util.*;
public class Demoarraylist {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		ArrayList a=new ArrayList();

		a.add(s);

		a.add(10);

		a.add("A");

		a.add(null);

		System.out.println(a);//[A, 10, A, null]

		a.remove(2);

		System.out.println(a);//[A, 10, null]

		a.add(2,"m");

		a.add("n");

		System.out.println(a);//[A, 10, m, null, n]
	}
}
