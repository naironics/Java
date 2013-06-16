package com.naironics.four.moreproperties;

public class Triangle {
	
	private String type;
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void draw(){
		System.out.println("Triangle with more properties are drawn");
	}

}
