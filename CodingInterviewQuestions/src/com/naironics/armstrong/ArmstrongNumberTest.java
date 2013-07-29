package com.naironics.armstrong;

import java.util.Scanner;

public class ArmstrongNumberTest {

	public static boolean isArmstrong(int number) {

		int result = 0;
		int originalNumber = number;

		while (number != 0) {
			int remainder = number % 10;
			result += remainder * remainder * remainder;
			number = number / 10;
		}

		if (result == originalNumber) {
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		
		System.out.println("Please enter any 3 digit number to check if it is an armstrong number :");
		int num = new Scanner(System.in).nextInt();
		
		
		if (isArmstrong(num)){
			System.out.println( num + " is an armstrong number");
		}
		else
		{
			System.out.println(num + " is not an armstrong number");
		}
		
		
	}
}
