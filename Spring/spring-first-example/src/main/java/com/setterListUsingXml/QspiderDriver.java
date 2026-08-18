package com.setterListUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class QspiderDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("QspiderConfig.xml");
		
		Qspider q = (Qspider) context.getBean("qspider");
		
		System.out.println(q);
		
		List<String> branch_list = q.getBranch_name();
		
		System.out.println("ID:" + q.getId());
		for(String s : branch_list) {
			System.out.println("Branch Name: " + s);
		}
		
		System.out.println("Location: " + q.getLocation());
	}
}
