package com.src;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="y";
		String str;
		Scanner s=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		do
		{
			System.out.println("enter username");
			str=s.next();
			al.add(str);
			System.out.println("Do you want to continue[Y/N]");
			ch=s.next();
		}while(ch.equals("y"));
		Main o=new Main();
		System.out.println("Entered names are:");
		o.display(al);
	}
	public void display(ArrayList<String> al)
	{
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			String st=obj.toString();
			System.out.println(st);
		}
	}
}