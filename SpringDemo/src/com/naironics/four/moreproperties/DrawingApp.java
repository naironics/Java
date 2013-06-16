package com.naironics.four.moreproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springnew.xml");
		Triangle triangle1 = (Triangle)ctx.getBean("triangle1");
		String temp1 = triangle1.getType();
		System.out.println(temp1);
		
		Triangle triangle2 = (Triangle)ctx.getBean("triangle2");
		String temp2 = triangle2.getType();
		System.out.println(temp2);

		Triangle triangle3 = (Triangle)ctx.getBean("triangle3");
		String temp3 = triangle3.getType();
		System.out.println(temp3);
		
		// Closing ctx by down casting ApplicationContext to ConfigurableApplicationContext , which defines close method
		//((ConfigurableApplicationContext)ctx).close();     

	}

}
