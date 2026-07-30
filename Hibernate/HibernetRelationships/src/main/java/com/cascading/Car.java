package com.cascading;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_car")
	@SequenceGenerator(name = "my_car", initialValue = 101, allocationSize = 1)
	private int id;
	private String name;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "my_car_engine_map") // used to remove foreign key column in Engine Table.
	private Engine engine;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}
	
	
}
