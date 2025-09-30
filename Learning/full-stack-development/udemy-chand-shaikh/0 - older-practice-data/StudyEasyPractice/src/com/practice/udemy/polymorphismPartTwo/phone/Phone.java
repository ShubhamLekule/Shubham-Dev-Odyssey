package com.practice.udemy.polymorphismPartTwo.phone;

public class Phone {
	private String model;

	public Phone(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	public void features() {
		System.out.println("Featured Phone");
	}

}
