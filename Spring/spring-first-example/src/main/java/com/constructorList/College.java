package com.constructorList;

import java.util.*;

public class College {
	
	int id;
	String name;
	List<String> courses;
	
	public College(int id, String name, List<String> courses) {
		
		this.id = id;
		this.name = name;
		this.courses = courses;
		
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	
	
	

}
