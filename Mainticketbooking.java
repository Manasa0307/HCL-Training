package com.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mainticketbooking {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<Ticketbooking> tickets = new ArrayList<>();
		System.out.println("Enter the number of customers");
		int noOfCustomers = in.nextInt();
		in.nextLine();
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (int i = 0; i < noOfCustomers; i++) {
			String details[] = in.nextLine().split(",");
			tickets.add(new Ticketbooking(details[0], Integer.parseInt(details[1])));
		}
		Ticketbooking maxTicket = Collections.max(tickets, new Ticketbooking());
		Ticketbooking minTicket = Collections.min(tickets, new Ticketbooking());
		System.out.println(minTicket.getCustomerName() + " spends minimum amount of Rs." + minTicket.getPrice());
		System.out.println(maxTicket.getCustomerName() + " spends maximum amount of Rs." + maxTicket.getPrice());
		
	}
}