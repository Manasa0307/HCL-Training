package com.src;

public class CurrentAccount extends Account
{
	String tinnumber;

public CurrentAccount() {
	super();
}
public CurrentAccount(String accNo, String accName, String bankname, String tinnumber) {
	super(accNo, accName, bankname);
	this.tinnumber = tinnumber;
}
public String getTinnumber() {
	return tinnumber;
}
public void setTinnumber(String tinnumber) {
	this.tinnumber = tinnumber;
}
public void display()
{
	super.display();
	System.out.println(tinnumber);
}

}

	