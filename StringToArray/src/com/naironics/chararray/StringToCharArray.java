package com.naironics.chararray;

public class StringToCharArray {

	public static void main(String[] args) {

		String str = "abcdefgh";
		
		System.out.println("String as Character Array : ");
		// String to Char Array
		char letters[] = str.toCharArray();

		for (int i = 0; i < letters.length; i++) {

			System.out.print(letters[i] + ", ");

		}

	}

}
