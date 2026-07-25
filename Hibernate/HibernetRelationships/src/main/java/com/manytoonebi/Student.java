package com.manytoonebi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobile;
	
	@OneToMany
	List<Subject> subject;

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getMobile() {
		return mobile;
	}



	public void setMobile(long mobile) {
		this.mobile = mobile;
	}



	public List<Subject> getSubject() {
		return subject;
	}



	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}



	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
