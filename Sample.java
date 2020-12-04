package com.src;

public class Sample {
	int rev(int n) {
		int rev = 0, rem, digit;
		while (n != 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
	return rev;
	}
}