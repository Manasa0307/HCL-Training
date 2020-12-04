package com.src;

public class Savingsaccount extends Account{
	String orgname;

	public Savingsaccount() {
		super();
	}

	public Savingsaccount(String accNo, String accName, String bankname, String orgname) {
		super(accNo, accName, bankname);
		this.orgname = orgname;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public void display()
	{
		super.display();
		System.out.println(orgname);
	}

}
