package com.naironics.basesystems;

public class BaseSystems {

	public static String decimalToBinary(int x) {
		return Integer.toString(x, 2);
		// or
		//return Integer.toBinaryString(x);
	}
	
	public static String decimalToOctal(int x) {
		return Integer.toString(x, 8);
		// or
	   //return Integer.toOctalString(x);
	}
	
	public static String decimalToHexaDecimal(int x) {
		return Integer.toString(x, 16);
		// or
		//return Integer.toHexString(x);
	}

	public static void main(String[] args) {
		
		int x = 432;
		
		// 432 in Binary  = 110110000
				
		System.out.println(decimalToBinary(x));
		// 432 in Octal   = 660
		/* [6*pow(8,2)] + [6*pow(8,1)] + [0 *pow(8,0)]
		 * [384] + [48] + 0
		 *  = 432
		 * */
		
		System.out.println(decimalToOctal(x));
		
		// 432 in HexaDecimal  = 1b0
		/* [1*pow(16,2)] + [b*pow(16,1)] + [0 *pow(16,0)]
		 * [1*256] + [11*16] + 0
		 * 256 + 176 = 432
		 * */
		System.out.println(decimalToHexaDecimal(x));

	}

}
