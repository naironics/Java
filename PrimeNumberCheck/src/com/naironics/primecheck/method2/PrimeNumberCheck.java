package com.naironics.primecheck.method2;

/* The method 1 doesn’t seem bad at first, but we can make it faster – much faster. 
 * Consider that if 2 divides some integer n, then (n/2) divides n as well. 
 * This tells us we don’t have to try out all integers from 2 to n. Now we
 *  can modify our algorithm:*/

public class PrimeNumberCheck {

	public static void main(String[] args) {

		int n = 9;
		System.out.println(isPrime(n));
	}

	// checks whether an int is prime or not.
	public static boolean isPrime(int n) {
		for (int i = 2; 2 * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
