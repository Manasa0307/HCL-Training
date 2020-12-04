package com.src;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add("A");
al.add("manasa");
al.add(1);
al.add(12346);
System.out.println(al);
al.remove(1);
al.remove("manasa");
System.out.println(al);
al.add(null);
al.add(3, "manasa");
System.out.println(al);
	}

}
