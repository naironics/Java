package com.naironics.collectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();

		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Guava");
		fruits.add("Orange");
		fruits.add("Cranberry");
		fruits.add("Mango");
		fruits.add("Strawberry");
		fruits.add("Blueberry");
		

		Collections.sort(fruits);

		int i = 0;
		for (String fruit : fruits) {
			System.out.println("fruit " + ++i + ": " + fruit);
		}
	}
}
