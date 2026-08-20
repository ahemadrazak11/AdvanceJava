package com.hasarelationship.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentHasAConfig.xml");
		
		Student  s = (Student) context.getBean("student");
		
//		System.out.println(s);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		List<Course> c = s.getCourse();
		
		for( Course course : c) {
			
			System.err.println(course.getName() + " : " + course.getFees());
		}
		
		
	}

}
