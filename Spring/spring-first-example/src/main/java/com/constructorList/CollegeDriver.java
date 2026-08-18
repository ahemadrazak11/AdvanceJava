package com.constructorList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CollegeConfig.xml");
		
		College clg = (College) context.getBean("college"); // it return the Object type of data we have to downcast it into College type of data.
		
		System.out.println("============= toString() Output ===============");
		
		System.out.println(clg); // it return all the values present in its property including list instead of address because toString method is Override.
		
		System.out.println("============================");
		
		System.out.println("College ID: " + clg.id);
		System.out.println("College Name: " + clg.name);
		
		System.out.println("Courses:");		
		int i = 1;
		for(String s : clg.courses) {
			
			System.out.println(i++ + ". " + s);
		}
		
	}
}
