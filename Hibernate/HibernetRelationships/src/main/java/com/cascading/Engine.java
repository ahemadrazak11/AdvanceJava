package com.cascading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Engine {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_car_engine")
	@SequenceGenerator(name = "my_car_engine", initialValue = 201, allocationSize = 1)
	private int id;
	private double hp;
	
	@OneToOne(mappedBy = "engine") // used to remove foreign key column
	
	private Car car;
	
	
	public int getId() {
		return id;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getHp() {
		return hp;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", hp=" + hp + "]";
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	
	
	
	
}

