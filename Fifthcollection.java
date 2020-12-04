package com.src;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Fifthcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = "y";
		String str;
		Scanner s = new Scanner(System.in);
		Set<String> st = new HashSet<String>();
		do {
			System.out.println("enter username");
			str = s.next();
			st.add(str);
			System.out.println("Do you want to continue[Y/N]");
			ch = s.next();

		} while (ch.equals("y"));

		System.out.println("The unique number of usernames is " + st.size());
	}

}
