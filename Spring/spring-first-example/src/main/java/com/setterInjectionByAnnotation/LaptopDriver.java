package com.setterInjectionByAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext c = new AnnotationConfigApplicationContext(LaptopConfig.class);
		
		Laptop l = (Laptop) c.getBean("laptop");
		
		System.out.println(l);
		
		System.out.println(l.getPrice());
		
		System.out.println(l.getName());
		
	}

}
