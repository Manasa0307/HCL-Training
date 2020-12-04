package com.src;

import java.util.ArrayList;
import java.util.*;

public class Hallthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		int n;
		String hall;
		String search;
		System.out.println("enter the no of halls");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{System.out.println("enter the name of hall "+i);
			hall=s.next();
			al.add(hall);
		}
		System.out.println("enter the hallname to be searched");
		search=s.next();
		boolean str;
		
		if(al.contains(search))
		
			System.out.println(search+" is found at position "+al.indexOf(search));
		else
			System.out.println(search+" is not found");
			
		
				}

}
