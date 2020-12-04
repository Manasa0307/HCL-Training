package com.src;

import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		String name;
		String country;
		String skill;
		Scanner o=new Scanner(System.in);
		System.out.println("enter name");
		name=o.nextLine();
		System.out.println("enter country");
		country=o.nextLine();
		System.out.println("enter skill");
		skill=o.nextLine();
		System.out.println("Details:");
		System.out.println("name:"+name);
		System.out.println("country:"+country);
		System.out.println("skill:"+skill);
		// TODO Auto-generated method stub

	}

}
