package com.src;

import java.util.Scanner;

public class Icici implements Mutualfund {
	int amount, tenure, interest;

	Scanner s = new Scanner(System.in);

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount you want to invest");

		amount = s.nextInt();
	}

	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("Enter the tenure of SIP");

		tenure = s.nextInt();
		interest = 60;
		int total = (amount * tenure * interest) / 100;
		System.out.println("Icici bank-");

		System.out.println("You will have returns as " + total + " in " + tenure + " years");

	}

}
