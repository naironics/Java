package com.naironics.arraysort;

import java.util.Arrays;

public class ArraysSort {
	
	public static void main(String[] args){
		String[] fruits = new String[] {"Banana","Grapes","Pineapple","Apple","Mango"};
		
		Arrays.sort(fruits);
		
		int i=0;
		
		for(String fruit:fruits){
			System.out.println("fruit " + ++i + ": " + fruit);
		}
	}

}
