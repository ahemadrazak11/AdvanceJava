package com.cascading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Subjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject_id")
	@SequenceGenerator(name = "subject_id", initialValue = 201, allocationSize = 1)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="Subject_Foreign_Key")
	private Students student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	
	
}
