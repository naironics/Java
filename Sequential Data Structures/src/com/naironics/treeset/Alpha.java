package com.naironics.treeset;

import java.util.TreeSet;

/* Java program to demonstrate the use of TreeSet Collection Class
 * 
 * Methods of TreeSet
 * ==================
 * 1. add()
 * 2. remove()
 * 3. size()
 * 4. lower()
 * 5. higher()
 * 6. first()
 * 7. last()
 * 8. clear()
 */

public class Alpha {
	
	public static void main(String[] args){
		TreeSet<String> days = new TreeSet<String>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		System.out.println("The days in alphabetical order are :");
		for (String day:days){
			System.out.println(day);
		}
		
		System.out.println("The day before Thursday in alphabetical order is "+ days.lower("Thursday"));
		System.out.println("The day after Thursday in alphabetical order is "+ days.higher("Thursday"));
		
		System.out.println("The first day in alphabetical order is " + days.first());
		System.out.println("The last day in alphabetical order is " + days.last());
		
		days.remove("Friday");
		
		System.out.println("After removing Friday, the days in alphabetical order are :");
		for (String day:days){
			System.out.println(day);
		}
		
		days.clear();
		
		System.out.println("The number of days after clearing everything should be : " + days.size());
		
	}
	
	

}
