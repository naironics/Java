package com.naironics;

import java.util.Scanner;

public class PalindromeNumberChecker {

	public static void main(String[] args) {

		System.out.println("Enter any number: ");
		int palindrome = new Scanner(System.in).nextInt();

		if (isPalindrome(palindrome)) {
			System.out.println(palindrome + " is a palindrome number");
		} else {
			System.out.println(palindrome + " is not a palindrome number");
		}
	}
		
		public static boolean isPalindrome(int number){
			int palindrome = number;
			int reverse = 0;
			
			while(palindrome != 0){
				int remainder = palindrome % 10;
				reverse = reverse*10 + remainder;
				palindrome = palindrome/10;
			}
			if (number==reverse){
				return true;
			}
			return false;
		}
	
}
