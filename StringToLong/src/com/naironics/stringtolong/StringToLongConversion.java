package com.naironics.stringtolong;

/*
Algorithm :
 -----------
In order to convert a String of digits to long, 
following are the sub steps involved:
   
	1. Parse each digit in the string to an integer.
  	2. If the entire string represents valid numeric digits,
 		 read digits from right to left and multiply 
 		 it with its appropriate exponent and add them
  	     up together.
  	   else return -1;

Limitations of this Program :
--------------------------------
 
1. cannot handle numbers outside long range (ie numbers with more than 19
   digits) , also certain 19 digit numbers outside long's range.
   
   (i.e. , if a user enters a 19 digit number but is outside positive long range,
   numbers from 9223372036854775808 to 9999999999999999999 are equivalent to
   -9223372036854775808 to -8446744073709551617 ,but cannot cover the negative
   range from -1 to -8446744073709551616)
 
2. cannot handle negative long numbers 

*/

public class StringToLongConversion {

	// helper method for stringToLong

	/*
	 * This method converts a character that is a digit into its equivalent
	 * integer, for all other unicode characters it returns -1
	 */
	private static int characterToIntegerDigit(char c) {
		// since all characters are integers in UTF-16
		if (c >= 48 && c <= 57) {
			return (c - 48);
		}
		return -1;
	}
	
	
	// helper method for stringToLong
	
	/* This method returns ten to the power of a given number 
	  */	
	private static long tenToThePowerOfInt(int number) {

		long result = 1; // default case (10 power 0)

		// checking for out of long range
		if (number > 18) {
			return -1;
		}

		for (int i = 0; i < number; i++) {
			result = result * 10;
		}

		return result;

	}
	
	// the method that is being exposed for conversion
	public static long stringToLong(String s) throws OutOfLongRangeException {

		if (s.length() == 0) {
			return -1;
		}

		else if (s.length() > 19) {
			throw new OutOfLongRangeException(
					"This string cannot be represented in Long range");
		}

		char characterOfFocus;
		int numericCharacter = 0;
		long answer = 0, temp = 0;

		for (int expoTen = 0; expoTen < s.length(); expoTen++) {

			characterOfFocus = s.charAt((s.length() - 1) - expoTen);
			numericCharacter = characterToIntegerDigit(characterOfFocus);

			if (numericCharacter == -1) {
				return -1;
			}

			if (tenToThePowerOfInt(expoTen) == -1) {
				return -2;
			}

			answer = answer + numericCharacter * tenToThePowerOfInt(expoTen);

			/*
			 * condition to check if answer goes beyond the range of positive
			 * long, but is still a valid 19 digit number (when answer becomes a
			 * negative long) i.e. the numbers from 9223372036854775808 to
			 * 9999999999999999999 becomes -9223372036854775808 to
			 * -8446744073709551617 but does not cover the negative long range
			 * of -1 to -8446744073709551616
			 */

			if (answer < temp) {

				throw new OutOfLongRangeException(
						"This string cannot be represented in Long range");

			}
			temp = answer;

		}

		return answer;

	}

	private static void test() throws OutOfLongRangeException {

		long case1 = stringToLong("1234567"); // valid number in long's positive
												// range
			
		if (case1 == 1234567)
		{
			System.out.println("Success");
		}
		else{
			System.out.println("Failure");
		}
			
		/*  other cases are commented out  *************/

		/*long case2 = stringToLong("12345678909876543210"); // 20 digit number
		System.out.println(case2);

		long case3 = stringToLong("9223372036854775808"); // 19 digit number
															// outside long's
															// range
		System.out.println(case3);

		long case4 = stringToLong("abcdefghi"); // random string, not a number
		System.out.println(case4);*/

	}

	public static void main(String[] args) {

		try {
			test();
		} catch (OutOfLongRangeException oe) {
			oe.printStackTrace();
		}
	}

}
