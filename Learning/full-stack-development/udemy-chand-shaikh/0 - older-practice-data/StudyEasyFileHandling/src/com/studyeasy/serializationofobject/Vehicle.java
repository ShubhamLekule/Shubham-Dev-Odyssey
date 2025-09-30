package com.studyeasy.serializationofobject;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int number;
	public Vehicle(String name, int number) {
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", number=" + number + "]";
	}

}
