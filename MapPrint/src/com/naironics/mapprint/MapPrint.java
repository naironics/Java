package com.naironics.mapprint;

import java.util.HashMap;
import java.util.Map;

public class MapPrint {
	
	public static void main(String[] args) {
		Map<String, Integer> nameAge = new HashMap<String, Integer>();

		nameAge.put("Thomas", 23);
		nameAge.put("Sara", 27);
		nameAge.put("Tracy", 34);
		nameAge.put("Fabian", 47);
		nameAge.put("Lillian", 39);
		nameAge.put("Susan", 56);
		nameAge.put("Sebastian", 78);
		nameAge.put("Emily", 17);
		nameAge.put("Foster", 49);
		nameAge.put("Gregory", 31);

		for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());
		}
	}

}
