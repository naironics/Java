package com.naironics.looping;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListLoop {

	public static void main(String[] args) {

		String myArray[] = new String[] { "Array 1", "Array 2", "Array 3",
				"Array 4", "Array 5" };

		// Converting Array to List
		List<String> myList = Arrays.asList(myArray);

		System.out.println("Method 1 : Simple For Loop");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		System.out.println("Method 2 : Advanced For Loop");
		for (String item : myList) {
			System.out.println(item);
		}

		System.out.println("Method 3 : While loop");
		int j = 0;
		while (j < myList.size()) {
			System.out.println(myList.get(j));
			j++;
		}

		System.out.println("Method 4 : Iterator");
		Iterator<String> iterator = myList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
