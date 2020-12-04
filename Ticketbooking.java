package com.src;

import java.util.Comparator;

public class Ticketbooking implements Comparator<Ticketbooking> {
	private String customerName;
	private Integer price;

	public Ticketbooking() {
		super();
	}

	public Ticketbooking(String customerName, Integer price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticketbooking [customerName=" + customerName + ", price=" + price + "]";
	}

	@Override
	public int compare(Ticketbooking arg0, Ticketbooking arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}