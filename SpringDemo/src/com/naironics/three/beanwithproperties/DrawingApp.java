package com.naironics.three.beanwithproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args){
		/* Instantiating a bean with properties */
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springproperties.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
	}

}
