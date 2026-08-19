package com.setter.map;

import java.util.*;

public class Account {

	private String name;
	private Map<String, Double> balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getBalance() {
		return balance;
	}
	public void setBalance(Map<String, Double> balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	
}
