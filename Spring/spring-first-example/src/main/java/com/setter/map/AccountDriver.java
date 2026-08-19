package com.setter.map;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AccountConfig.xml");
		
		Account a = (Account) context.getBean("account");
		
		System.out.println(a);
		
		for(Map.Entry<String, Double> map : a.getBalance().entrySet()) {
			
			System.out.println(map.getKey() + " : " + map.getValue());
		}
		
	}

}
