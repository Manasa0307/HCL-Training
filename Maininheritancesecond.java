package com.src;
import java.util.Scanner;
public class Maininheritancesecond {
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		

			
		    Scanner s = new Scanner(System.in);
		    AccountBo ab = new AccountBo();
		    System.out.println("Enter account details :");
		    String acDetails = s.nextLine();
		    Fixedaccount fa1 = ab.getAccountDetails(acDetails);
		    //System.out.println("Account Number\tBalance\tAccount Holder Name"
		    //    + "Minimum Balance\tLocking Period");
		    System.out.format("%-20s %-10s %-20s %-20s %s\n",
		          "Account Number", "Balance", "Account holder name", "Minimum balance", "Locking period");
		    System.out.format("%-20s %-10s %-20s %-20s %s", fa1.getAccNo(), 
		           fa1.getBalance(), fa1.getAccholdername(), fa1.getMinimumBalance(),
		           fa1.getLockingPeriod()); 
		  }
}