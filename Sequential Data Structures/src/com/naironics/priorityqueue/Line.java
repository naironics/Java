package com.naironics.priorityqueue;

import java.util.PriorityQueue;

/* Java program to demonstrate the use of PriorityQueue Collection Class
 * 
 *  Methods of PriorityQueue
 *  ========================
 *  1. add()
 *  2. remove()
 *  3. poll()
 *  4. peek()
 *  5. clear()
 *  6. size()
 */

public class Line {
	public static void main(String[] name) {

		PriorityQueue<String> hackers = new PriorityQueue<String>();

		hackers.add("Mark Zuckerberg");
		hackers.add("Ryan Dahl");
		hackers.add("Adam D Angelo");
		hackers.add("David Karp");
		hackers.add("Drew Houston");
		hackers.add("Jack Dorsey");
		hackers.add("Kevin Systrom");
		hackers.add("Dave Morin");

		System.out.println("The hacker list size is  " + hackers.size()
				+ " and its members are :");
		for (String hacker : hackers) {
			System.out.println(hacker);
		}

		// removing the head
		hackers.poll();

		System.out.println("After removing the head the hacker list is: ");
		for (String hacker : hackers) {
			System.out.println(hacker);
		}

		// removing a specific hacker
		hackers.remove("Ryan Dahl");
		System.out
				.println("After removing a specific elemnt, the hacker list is : ");
		for (String hacker : hackers) {
			System.out.println(hacker);
		}

		System.out.println("Currenlly the head of Priority Queue is: "
				+ hackers.peek());

		System.out.println("The size of Priority Queue is :" + hackers.size());

		hackers.clear();
		System.out.println("The current size of priority queue should be :"
				+ hackers.size());

	}
}
