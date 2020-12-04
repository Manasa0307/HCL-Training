package com.src;
import java.util.*;
public class Mainvenue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String city;
		String newname;
		String newcity;
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the venue name");
		name=s.nextLine();
		System.out.println("enter the city name");
		city=s.nextLine();
		Venue1 v=new Venue1();
		v.setName(name);
		v.setCity(city);
		do
		{
			System.out.println("Venue details:");
			System.out.println("venue name:"+name);
			System.out.println("city name"+city);
			System.out.println("verify and update venue details");
			System.out.println("Menu");
			System.out.println("1.Update venue details");
			System.out.println("2.Update system details");
			System.out.println("All information correct or exit");
			System.out.println("type1 or 2 or 3");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter venue name");
				newname=s.next();
				name=newname.replace(newname, name);
				break;
			case 2:
				System.out.println("Enter city name");
				newcity=s.next();
				city=newcity.replace(newcity, city);
				break;
			case 3:
				System.out.println("Venue details:");
				System.out.println("venue name:"+name);
				System.out.println("city name:"+city);
			}
		}while(ch!=3);
	}
}