package com.src;

import java.util.Scanner;

public class ExtratpeMain1 {

	public static void main(String[] args) {
		String name,newstring;
		long runs;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the extratype details ");
		newstring=s.next();
		System.out.println("Extratype details");
		String Str[] = newstring.split("#");
		System.out.println("Extratype:"+Str[0]);
		System.out.println("runs:"+Str[1]);
	}
		// TODO Auto-generated method stub
}
