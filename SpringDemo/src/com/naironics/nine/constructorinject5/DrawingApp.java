package com.naironics.nine.constructorinject5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-constr5.xml");
		Triangle triangle =  (Triangle)ctx.getBean("triangle");
		triangle.draw();
		((ConfigurableApplicationContext)ctx).close();
	}

}
