package com.src;

public class Account {
	String accNo;
	String accName;
	String bankname;
	
	public Account() {
		super();
	}
	public Account(String accNo, String accName, String bankname) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.bankname = bankname;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	protected void display()
	{
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(bankname);
	}
	

}
