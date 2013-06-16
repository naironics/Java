package com.naironics.two.withspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * import org.springframework.beans.factory.BeanFactory;
 * import org.springframework.beans.factory.xml.XmlBeanFactory;
 * import org.springframework.core.io.FileSystemResource;
*/


public class DrawingApp {
	public static void main(String[] args){
		/* In this we accomplish using Triangle class method here using BeanFactory 
		as below
		*/
      //		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		// But, since BeanFactory is deprecated from Spring 3.1 , we use ApplicationContext
		
		@SuppressWarnings("resource")  // Avoiding context not closed warning
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		
		
	}

}
