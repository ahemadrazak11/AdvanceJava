package com.setterInjectionByAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private double price;
	
	private String name;
	
	public Laptop(@Value("Lenovo") String name) {
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	@Value(value = "9999") // setter injection using annotation
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
