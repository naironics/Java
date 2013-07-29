package com.naironics.palindrome;

import java.util.Scanner;

public class PalindromeNumberTest {

	public static boolean isPalindrome(int number) {

		int original = number;
		int result = 0;

		while (number != 0) {
			int remainder = number % 10;
			result = result * 10 + remainder;
			number = number / 10;
		}

		if (result == original) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {

		System.out
				.println("Enter any number to check whether it is a palindrome number :");
		int num = new Scanner(System.in).nextInt();

		if (isPalindrome(num)) {
			System.out.println(num + " is a palindrome number.");
		} else {
			System.out.println(num + " is not a palindrome number.");
		}

	}

}
