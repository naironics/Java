package com.naironics.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static int getFibonacci(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}

		return getFibonacci(number - 1) + getFibonacci(number - 2);
	}

	public static void main(String args[]) {

		System.out
				.println("Enter how many numbers in fibonacci series to be printed: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println("The fibonacci numbers upto " + number
				+ "terms are :");
		for (int i=1 ; i <= number; i++) {
			System.out.print(getFibonacci(i));
			System.out.print(", ");
		}
	}

}
