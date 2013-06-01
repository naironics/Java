package com.naironics;

import java.util.Scanner;

public class PureStringReverse {

	public static void main(String[] args) {
		System.out.println("Enter any string to reverse it:");
		String originalString = new Scanner(System.in).next();
		
		String reversedString = reverseString(originalString);

		System.out.println("The original String is :" + originalString);
		System.out.println("The reversed String is : " + reversedString);
	}

	public static String reverseString(String str) {

		String temp = str.toLowerCase();
		char[] tempArray = temp.toCharArray();
		
		int i= 0, j = tempArray.length - 1;
		
		while (i<j){
			
			char t = tempArray[i];
			tempArray[i] = tempArray[j];
			tempArray[j] = t;
			i++;
			j--;
		}
		
		//String tempReverse = "";

		//return tempReverse;
		return new String(tempArray);
	}
}
