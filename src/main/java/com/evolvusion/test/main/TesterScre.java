package com.evolvusion.test.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.slf4j.Log4jLogger;

public class TesterScre {
	public static Log4jLogger LOG;

	public static void main(String[] args) {
		final List<String> lt= new ArrayList<>();
		
	//	lt=new ArrayList<String>();
		
		lt.add("hai");
		
		//lt= new ArrayList<String>();
		
		
		for (int i =0 ;i<10;i++) {
			Threads td = new Threads();
			td.start();
			System.out.println("getId "+td.getId());
			td.yield();
		}
		System.out.println("list  "+lt);
		
		
	}

}
