package com.evolvusion.test;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.Calendar;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSt {

	public static final Logger LOG = LoggerFactory.getLogger(TestSt.class);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String str = "addcad&&&////^^***@@!!!c";

		// = str.format("%1$sdreeeesh%1$s%06f", "dhsr");

		// Pattern.compile(regex, flags)

		String s = str.replaceAll("[^A-Za-z0-9]", "");
		
		String s1 = str.replaceAll("[A-Za-z0-9]", "");

		Date dt = new Date();
		LOG.info("", dt.getDate());

		LOG.info(s+"\n"+s1);

		for (int i = 0; i < str.length(); i++) {
			if (!str.matches("")) {

			}
		}

		hai();
	}

	public strictfp static void hai() {
		System.out.println("haiiiiiiiiii");
	}

	public /* */ TestSt() throws UnsupportedEncodingException {
		throw new UnsupportedEncodingException();
	}
}
