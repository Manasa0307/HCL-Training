package com.src;

import java.util.*;

public class ExtratypeMain {

	public static void main(String[] args) {
		String name,country,skill;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the player details");
		name=s.next();
		String Str[] = name.split(",");
		System.out.println("Name:"+Str[0]);
		System.out.println("Country:"+Str[1]);
		System.out.println("skill:"+Str[2]);
	}
}