package com.naironics.three.beanwithproperties;

public class Triangle {
	
	private String type;
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getTYpe(){
		return type;
	}

	public void draw(){
		System.out.println("Triangle with properties drawn");
	}
}
