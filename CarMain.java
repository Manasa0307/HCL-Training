package com.src;
import java.util.*;
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnum,old;
        String bra;
        Scanner o = new Scanner(System.in);
        cnum=o.nextInt();
        old=o.nextInt();
        bra=o.next();
        Ser obj=new Ser();
        obj.sum(cnum);
        obj.years(old);
        obj.brand(bra);
	}
}
