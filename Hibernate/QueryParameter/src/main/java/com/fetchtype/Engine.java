package com.fetchtype;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double hp;
	public int getId() {
		return id;
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
