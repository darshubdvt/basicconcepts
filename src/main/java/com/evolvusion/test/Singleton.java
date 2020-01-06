package com.evolvusion.test;

public class Singleton {
	
	public static volatile Singleton instance;

	private Singleton() {

	}

	public static synchronized Singleton getinstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}
