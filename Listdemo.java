package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="y";
				String str;
				int id;
				Scanner s=new Scanner(System.in);
				Employee emp=new Employee(String,Integer);
				ArrayList<Employee> al=new ArrayList<Employee>();
				do
				{
					System.out.println("enter username");
					str=s.next();
					System.out.println("enter id");
					id=s.nextInt();
					al.add(str,id);
					System.out.println("Do you want to continue[Y/N]");
					ch=s.next();
				}while(ch.equals("y"));
System.out.println(al);	
	}
}