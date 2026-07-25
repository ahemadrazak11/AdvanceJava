package com.manytoonebi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	
	@ManyToOne
	Student student;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public Student getStudent() {
		return student;
	}




	public void setStudent(Student student) {
		this.student = student;
	}




	public int getId() {
		return id;
	}




	@Override
	public String toString() {
		return "SubjectBi [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}