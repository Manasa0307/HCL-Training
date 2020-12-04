package com.src;
import java.util.*;
public class Mainfort {

	public static void main(String[] args) {
			System.out.println("1.Raj 2.shiv 3.Mur");
	        Scanner ob = new Scanner(System.in);
	        int ch=ob.nextInt();
	        switch(ch){
	            case 1: 
	            	Raj o=new Raj();
	            o.dis();
	            break;
	            case 2:
	            	Shiv o1=new Shiv();
	            o1.dis();
	            break;
	            case 3: 
	            	mur o2=new mur();
	            	o2.dis();
	            	break;
	        }
	}
}