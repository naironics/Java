package com.naironics;

import java.util.Scanner;

public class PalindromeStringChecker {

	public static void main(String[] args) {

		System.out.println("Enter any String:");
		String palindrome = new Scanner(System.in).next();

		if (isPalindrome(palindrome)) {
			System.out.println(palindrome + " is a palindrome string.");
		} else {
			System.out.println(palindrome + " is not a palindrome string.");
		}

	}
	public static boolean isPalindrome(String phrase){
		
		String checkString = phrase;
		
		String reversedCheckString = new StringBuilder(checkString).reverse().toString();
		
		if (checkString.equals(reversedCheckString)){
			return true;
		}
		return false;
			
	}
	

}
