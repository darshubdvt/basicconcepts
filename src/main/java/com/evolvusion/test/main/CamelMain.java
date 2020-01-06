package com.evolvusion.test.main;

import org.apache.camel.impl.DefaultCamelContext;

import com.evolvusion.test.CamelContextDummi;

public class CamelMain {

	public static void main(String[] args) {
		
		CamelContextDummi d = new CamelContextDummi();
		try {
			d.moveFolderContentJavaDSLTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
