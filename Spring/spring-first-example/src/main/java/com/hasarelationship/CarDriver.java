package com.hasarelationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		
		Car c = (Car) context.getBean("car");
		
		System.out.println(c);
		c.run();
	}
}