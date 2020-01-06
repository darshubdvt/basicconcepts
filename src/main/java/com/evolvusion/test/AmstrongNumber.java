package com.evolvusion.test;

public class AmstrongNumber {
	
	
	public static void main(String[] args) {

		System.out.println(isamtrong(111));

	}

	public static boolean isamtrong(int number) {
		
		int a = 0;
		int val = 0;
		int temp = number;

		while (number > 0) {
			a = number % 10;
			number = number / 10;
			val = +(a * a * a);
		}

		if (temp == val) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}
}
