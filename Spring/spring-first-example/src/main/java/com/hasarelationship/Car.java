package com.hasarelationship;

public class Car {
	
	private Engine e;

	public void run() {
		System.out.println("From Car");
		e.display();
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Car [e=" + e + "]";
	}
	
	
}
