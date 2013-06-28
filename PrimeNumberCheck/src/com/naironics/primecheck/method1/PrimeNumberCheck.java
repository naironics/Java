package com.naironics.primecheck.method1;


/* Trivial Case : Trivially, we can check every integer from 1 to itself 
(exclusive) and test whether it divides evenly. */

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int n = 7;
		System.out.println(isPrime(n));
	}
	
	//checks whether an int is prime or not.
	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;

	}

}
