package com.practice.udemy.multipleinheritance.person;

public class NonVeganPerson extends Person{

	@Override
	public void eat() {
		System.out.println("Eats Non Vegan Food");
		
	}

}
