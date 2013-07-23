package com.naironics.binaryadd;

public class BinaryAddition {

	public static String binaryAdd(String str1, String str2) {

		int x = Integer.parseInt(str1, 2);
		int y = Integer.parseInt(str2, 2);

		int z = x + y;

		return Integer.toBinaryString(z);
	}

	public static void main(String[] args) {

		String str1 = "101";
		String str2 = "100";
		
		System.out.println(binaryAdd(str1, str2));

	}

}
