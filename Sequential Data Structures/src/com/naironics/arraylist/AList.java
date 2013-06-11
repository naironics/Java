package com.naironics.arraylist;

import java.util.ArrayList;

/* Program to demonstrate the usage of ArrayList in Java.
 * 
 * Methods of ArrayList 
 * ====================
 * 	1. add()
 * 	2. remove()
 *  3. size()
 *  4. get()
 */	


public class AList {
	
	public static void main(String[] args){
		
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		grades.add(100);
		grades.add(80);
		grades.add(75);
		grades.add(60);
		grades.add(95);
		
		System.out.println("Grades size :"+ grades.size());
		
		int total= 0;
		
		for(int i =0 ; i < grades.size(); i++){
			total += grades.get(i);
		}
		
		System.out.println("The Grades total :"+ total);
		
		double average = total/grades.size();
		
		System.out.println("The Grades average :" + average);
		
		grades.remove(4);
		
		System.out.println("New Grades size:"+ grades.size());
		
		grades.add(87);
		grades.add(76);
		
		System.out.println("Newer Grades size :"+grades.size());
		
		int newTotal = 0;
		
		for (Integer grade:grades){
			newTotal += grade;
		}
		
		System.out.println("The new total of Grades is :"+newTotal);
		
		double newAverage = newTotal/grades.size();
		
		System.out.println("The new average is :"+newAverage);
		
		
	}

}
