package com.src;

import java.util.*;

public class Manasa {

	public static void main(String[] args) {
		
		int ch;
		System.out.println("enter choice");
		Scanner s = new Scanner(System.in);
		ch = s.nextInt();
		String accNo;
		String accName;
		String bankname;
		
		switch (ch) {
		case 1:
			
			String orgname;
			String a;
			a = s.next();
			System.out.println("Enter Account details in comma seperated format");
			String[] a1 = a.split(",");

			accNo = a1[0];
			accName = a1[1];
			bankname = a1[2];
			orgname = a1[3];

			Savingsaccount o = new Savingsaccount(accNo, accName, bankname, orgname);
			o.display();
			break;
		case 2:
		
			String tinnumber;
			String b;
			b = s.next();
			System.out.println("Enter Account details in comma seperated format");
			String[] b1 = b.split(",");
			accNo = b1[0];
			accName = b1[1];
			bankname = b1[2];
			tinnumber = b1[3];
			CurrentAccount c=new CurrentAccount(accNo, accName, bankname, tinnumber);
			c.display();
			break;
		}

	}

}
