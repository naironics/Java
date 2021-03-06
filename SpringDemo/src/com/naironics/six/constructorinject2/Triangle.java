package com.naironics.six.constructorinject2;

/* Check the xml configuration file for variation in constructor injection */

public class Triangle {

	private String type;
	private int height;
	
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(int height){
		this.height = height;
	}
	
	public Triangle (String type, int height){
		this.type = type;
		this.height = height;
	}
	
	public String getType(){
		return type;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void draw(){
		System.out.println(getType()+ " triangle drawn of height " + getHeight());
	}
}
