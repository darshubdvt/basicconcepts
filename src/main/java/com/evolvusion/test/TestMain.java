package com.evolvusion.test;

public class TestMain {
	public static void main(String[] args) {
		HowManyObjectsCreated h1 = new HowManyObjectsCreated();

		HowManyObjectsCreated h2 = new HowManyObjectsCreated();

		HowManyObjectsCreated h3 = new HowManyObjectsCreated();

		HowManyObjectsCreated h4 = new HowManyObjectsCreated();

		HowManyObjectsCreated h5 = new HowManyObjectsCreated();

		HowManyObjectsCreated h6 = new HowManyObjectsCreated();
		
	//	h2.setCount(7);
		
		System.out.println(h2.getCount());

	}
}
