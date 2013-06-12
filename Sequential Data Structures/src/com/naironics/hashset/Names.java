package com.naironics.hashset;

import java.util.HashSet;

/* Java program to demonstrate the use of HashSet Collection Class
 * 
 * Methods of HashSet
 * ================== 
 * 1. add()
 * 2. remove()
 * 3. size()
 * 4. contains()
 * 5. clear()
 * 
 */
public class Names {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet<String>();

		names.add("Tom Cruise");
		names.add("Will Smith");
		names.add("Nickolas Cage");
		names.add("Christian Bale");
		names.add("Morgan Freeman");

		System.out.println("The number of names are :" + names.size());

		for (String name : names) {
			System.out.println(name);
		}

		names.remove("Nickolas Cage");

		System.out.println("The new number of names are : " + names.size());

		String name1 = "Nickolas Cage";

		if (names.contains(name1)) {
			System.out.println(name1 + " is present in names.");
		} else {
			System.out.println(name1 + " is not present in names.");
		}

		names.add("Tom Hanks");
		names.add("Keanu Reeves");
		names.add("Robert Downey Jr.");
		names.add("Johnny Depp");

		System.out.println("The newest number of names are : " + names.size());

		System.out.println("and the names are :");

		for (String name : names) {
			System.out.println(name);
		}
		
		names.clear();
		
		System.out.println("The current number of names are : " + names.size());

	}

}
