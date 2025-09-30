package com.practice.udemy.polymorphismPartOne.phone;

public class Phone {
private String model;

public Phone(String model) {
	super();
	this.model = model;
}
public void features() {
	System.out.println("Featured phone");
}
public String getModel() {
	return model;
}
}
