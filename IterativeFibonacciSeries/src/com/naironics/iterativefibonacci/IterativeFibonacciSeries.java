package com.naironics.iterativefibonacci;

import java.util.Scanner;

public class IterativeFibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out
				.println("Enter the number upto which Fibonacci series is to be print :");

		int number = new Scanner(System.in).nextInt();

		System.out.println("The fibonacci series upto " + number + "numbers :");

		for (int i = 1; i < number; i++) {
			System.out.print(fibonacciLoop(i) + " ");
		}

	}
	
	public static int fibonacciLoop(int number){
		if(number==1 || number == 2){
			return 1;
		}
		
		int fibo1=1, fibo2=1, fibonacci=1;
		
		for(int i=3; i<=number; i++){
			fibonacci = fibo1+fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
			return fibonacci;  
		
	}

}
