package com.cascading;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id")
	@SequenceGenerator(name = "student_id", initialValue = 101, allocationSize = 1)
	private int id;
	private String name;
	private String email;
	
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "student")
	private List<Subjects> subjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", subjects=" + subjects + "]";
	}
	
	

}
