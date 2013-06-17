package com.naironics.fibonaccirecursion;

import java.util.Scanner;

public class RecursiveFibonacciSeries {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		System.out.print("Enter the number upto which you want to print the Fibonacci Series: \n");
		
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("The fibonacci sequence upto " + number + " numbers :\n");
		
		for(int i=1; i<number; i++){
			System.out.print(fibonacciRecursion(i) + " ");
		}
		
	}
	
	public static int fibonacciRecursion(int number){
		if(number == 1 || number ==2){
			return 1;
		}
		
		return fibonacciRecursion(number-1) + fibonacciRecursion(number-2);
	}

}
