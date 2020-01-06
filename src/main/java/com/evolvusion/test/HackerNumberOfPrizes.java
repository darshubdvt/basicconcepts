package com.evolvusion.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HackerNumberOfPrizes {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(100);
		marks.add(60);
		marks.add(50);
		marks.add(40);

		System.out.println(numberOfprizes(3, marks));

	}

	public static int numberOfprizes(int k, List<Integer> marks) {

		Collections.sort(marks, Collections.reverseOrder());
		// Collections.reverseOrder();
		// int[] arr = marks.stream().mapToInt(Integer::intValue).toArray();
		// Arrays.sort(arr);
		int[] arr = new int[marks.size()];
		int numPrize = 0;
		for (int i = 0; i < marks.size(); i++) {
			if (marks.indexOf(marks.get(i)) == 0) {
				arr[i] = 1;
			} else {
				arr[i] = marks.indexOf(marks.get(i));
			}
			if (arr[i] <= k) {
				numPrize++;
			}
		}

		System.out.println(Arrays.toString(arr));

		/*
		 * 
		 * 
		 * Set<Integer> unique = new HashSet<>(); unique.addAll(marks);
		 * 
		 * System.out.println(unique); Map<Integer, Integer> ranks = new
		 * LinkedHashMap<>(); for (int a : marks) { ranks.put(a,
		 * Collections.frequency(marks, a)); }
		 */

		/*
		 * for() {
		 * 
		 * }
		 */

		/*
		 * System.out.println(ranks); System.out.println(marks.indexOf(100));
		 * System.out.println(unique);
		 */

		/*
		 * System.out.println(ranks); for (int u = 0; u < arr.length; u++) {
		 * //ranks.put(a, Collections.frequency(marks, a));
		 * arr[u]=Collections.frequency(marks, unique.iterator().next()); }
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */

		/*
		 * for(int i=0;) {
		 * 
		 * }
		 */

		return numPrize;
	}

}
