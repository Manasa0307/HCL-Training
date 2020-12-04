package com.src;
import java.util.*;

public class DeliveryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Long over;
			Long ball;
			Long runs;
			String batsman;
			String bowler;
			String nonstriker;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the over");
			over=s.nextLong();
			System.out.println("enter the ball");
			ball=s.nextLong();
			System.out.println("enter the runs");
			runs=s.nextLong();
			System.out.println("enter the bowler name");
			bowler=s.next();
			System.out.println("enter the batsman name");
			batsman=s.next();
			System.out.println("enter the allrounder name");
			nonstriker=s.next();
			System.out.println("details");
			System.out.println("over:"+over);
			System.out.println("ball:"+ball);
			System.out.println("runs:"+runs);
			System.out.println("bowler:"+bowler);
			System.out.println("batsman:"+batsman);
			System.out.println("nonstriker:"+nonstriker);
	}
}