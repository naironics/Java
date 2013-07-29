package com.naironics.stringreverse;

import java.util.Scanner;

public class StringReverse {

	// Iterative method
	public static String reverseStringIterative(String str) {

		StringBuilder sb = new StringBuilder();

		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			sb.append(strChars[i]);
		}

		return sb.toString();
	}

	// Recursive Method

	public static String reverseStringRecursive(String str) {

		if (str.length() < 2) {
			return str;
		}

		return reverseStringRecursive(str.substring(1)) + str.charAt(0);
	}

	public static void main(String args[]) {

		System.out.println("Enter any string to reverse it :");
		String str = new Scanner(System.in).next();

		System.out.println("The reverse of " + str
				+ " using iterative method is " + reverseStringIterative(str));

		System.out.println("The reverse of " + str
				+ " using recursive method is " + reverseStringRecursive(str));
	}

}
