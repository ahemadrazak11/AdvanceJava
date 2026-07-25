package com.onetomanybidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentBi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobile;
	
	@OneToMany
	List<SubjectBi> list;

	
	
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



	public List<SubjectBi> getList() {
		return list;
	}



	public void setList(List<SubjectBi> list) {
		this.list = list;
	}



	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
