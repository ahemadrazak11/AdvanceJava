package com.setterListUsingXml;

import java.util.*;

public class Qspider {
	
	private int id;
	private List<String> branch_name;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(List<String> branch_name) {
		this.branch_name = branch_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Qspider [id=" + id + ", branch_name=" + branch_name + ", location=" + location + "]";
	}
	
	

}
