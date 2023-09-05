package com.kiranacademy.api.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

	private int age;
	private String name;
	private int run;

	@Id

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Team [age=" + age + ", name=" + name + ", run=" + run + "]";
	}

}
