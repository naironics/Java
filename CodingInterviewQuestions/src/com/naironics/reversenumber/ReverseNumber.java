package com.naironics.reversenumber;

import java.util.Scanner;

public class ReverseNumber {

	public static int numberReverse(int number) {

		int result = 0;

		while (number != 0) {
			int remainder = number % 10;
			result = result * 10 + remainder;
			number = number / 10;
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println("Enter any number to reverse it :");
		int num = new Scanner(System.in).nextInt();
			

		System.out.println("Reverse of " + num + " is "
				+ numberReverse(num));
		
	}

}
