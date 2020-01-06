package com.evolvusion.test;

import java.util.Scanner;

public class Prgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if(Boolean.TRUE.equals(isPrime(3))) { System.out.println("TRUE"); }
		 */
		System.out.println("Prgms.main()..");
		System.out.println("Please enter number...");
		try (Scanner sc = new Scanner(System.in);) {
			int num = sc.nextInt();
			System.out.println(isPrime(num));
			System.out.println(num / 2 + "   " + num % 2);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static Boolean isPrime(int number) {

		if (number == 0 || number == 1) {
			return false;
		}

		for (int i = 2; i <= number / i; i++) {
			if (number % i == 0)
				return false;

		}

		return true;
	}

}
