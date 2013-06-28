package com.naironics.bytearray;

public class StringToByteArray {

	public static void main(String[] args){
	
		String str = "ABCDEFGHI";
		
		System.out.println("String as Byte Array : ");
		byte alphabets[] = str.getBytes();
		
		for(int i=0; i< alphabets.length;i++){
			System.out.print(alphabets[i] + ", ");
		}
	}
}
