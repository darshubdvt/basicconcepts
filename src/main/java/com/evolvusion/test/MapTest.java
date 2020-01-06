package com.evolvusion.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapTest {

	public static final Logger LOG = LoggerFactory.getLogger(MapTest.class);

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();

		lst.add("hai");

		lst.add("hello");

		lst.add("wt are u doing");

		lst.add(null);

		lst.forEach(argument -> {
			/// if (lst1.equals("hai")) {
			LOG.info("LIsts we are having:::{}", argument);
			// }
		});

		Map<String, Integer> mp = new HashMap<>();

		mp.put("fst", 1);
		mp.put("2nd", 2);

		mp.put("fs1t", 1);

		mp.put(null, 4);

		mp.forEach((BiConsumer<? super String, ? super Integer>) mp);

		for (Entry<String, Integer> mp2 : mp.entrySet()) {
			LOG.info("LIsts we are having:::{}", (mp2.getKey() + " " + mp2.getValue() + "  " + mp));
		}
	}

}
