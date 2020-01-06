package com.evolvusion.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) throws Exception {

		// System.out.println(issAnagram("darshan", "shdaran"));

		System.out.println("dar".substring(3, 3));
		
		System.err.println(isAnagram("var", "rat"));

	}

	public static boolean issAnagram(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		// char[] ch2 = s2.toCharArray();

		// Map<String, Integer> mp = new HashMap<>();

		if (s1.length() != s2.length()) {
			return false;
		}

		for (char c : ch1) {
			int index = s2.indexOf(c);
			if (index == -1) {
				return false;
			}

			s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
			System.out.println(s2);
		}

		return true;

	}

	public static boolean isAnagram(String a1, String a2) {

		if (a1.length() != a2.length()) {
			return false;
		}

		char[] s1 = a1.toCharArray();
		char[] s2 = a2.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		if (Arrays.equals(s1, s2)) {
			return true;
		} else {

			return false;
		}
	}
}
