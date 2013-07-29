package com.naironics.primenumber;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out
				.println("Enter any number to check, whether it is a prime number:");
		int num = new Scanner(System.in).nextInt();

		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		
		
		System.out.println("Prime numbers from 1 to 100 are :");
		
		for (int i=3; i<101; i++){
			if(isPrime(i)){
				System.out.print(i);
				System.out.print(", ");
			}
		}
		

	}

}
