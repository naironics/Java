package com.naironics.objectinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args){
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	Triangle triangle = (Triangle)ctx.getBean("triangle");
	triangle.draw();
	}

}
