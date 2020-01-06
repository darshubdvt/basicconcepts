package com.evolvusion.test;

public class HowManyObjectsCreated {
	
	private static int count;
	
	public HowManyObjectsCreated() {
		count++;
		System.out.println("obj created");
	}

	public int getCount() {
		return count;
	}

	private void setCount(int count) {
		this.count = count;
	}
	
	
}
