package com.beanEliminate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("LaptopConfig.xml");
		
		Laptop l = (Laptop) context.getBean("laptop");
		
		System.out.println(l);
	}

}