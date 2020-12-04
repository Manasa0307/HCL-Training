package com.src;
import java.util.*;
public class Stall {
	 String name;
	 String detail;
	 String ownerName;
	String type;
	int size;
	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
}

	public  double computeCost(String stalltype,int size)
	{
		return size;
		
	}
	public double computeCost(String stalltype,int size,int noftv)
	{
		return noftv;
		
	}
}