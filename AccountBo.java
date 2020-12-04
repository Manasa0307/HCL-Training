package com.src;

public class AccountBo {
	
		
		public Fixedaccount getAccountDetails(String detail) {
			String[] temp1 = detail.split(",");
			Fixedaccount fa = new Fixedaccount();
		    
			fa.setAccNo(temp1[0]);
		    fa.setBalance(Double.parseDouble(temp1[1]));
		    fa.setAccholdername(temp1[2]);
		    fa.setMinimumBalance(Double.parseDouble(temp1[3]));
		    fa.setLockingPeriod(Integer.parseInt(temp1[4]));
		    return fa;
	}
}


