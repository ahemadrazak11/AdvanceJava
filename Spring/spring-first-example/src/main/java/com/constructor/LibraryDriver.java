package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("LibraryConfig.xml");
		
		Library l = (Library) applicationContext.getBean("library");
		
		System.out.println(l.id);
		System.out.println(l.name);
		System.out.println(l.location);
	}
}
