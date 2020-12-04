package com.src;

import java.util.ArrayList;
import java.util.*;
public class Mainitemtypecolection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String ch="y";
		Double deposit;
		Double costperday;
		Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		do
		{
			System.out.println("enter name");
			name=s.next();
			System.out.println("enter deposit");
			deposit=s.nextDouble();
			System.out.println("enter costperday");
			costperday=s.nextDouble();
			al.add(name);
			al.add(deposit);
			al.add(costperday);
			System.out.println("Do you want to continue[Y/N]");
			ch=s.next();
		}while(ch.equals("y"));
		Main o=new Main();
		System.out.println("Entered names are:");
		o.display(al);
	}
	public void display(ArrayList al)
	{
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			//String st=obj.toString();
			//System.out.println(obj);
		}
		System.out.println(al);
	}
}