package com.src;

public class Account1 {
	String accNo;
	double balance;
	String accholdername;
	
	public Account1() {
		super();
	}

	public Account1(String accNo, double balance, String accholdername) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accholdername = accholdername;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccholdername() {
		return accholdername;
	}

	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	

}
