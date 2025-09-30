package com.practice.udemy.multipleinheritance;

import com.practice.udemy.multipleinheritance.person.NonVeganPerson;
import com.practice.udemy.multipleinheritance.person.Person;
import com.practice.udemy.multipleinheritance.person.VeganPerson;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person shubham=new NonVeganPerson();
		shubham.speak();
		shubham.eat();
		shubham.message();
		shubham.breath();
		
		Person pooja=new VeganPerson();
		pooja.speak();
		pooja.eat();
		pooja.message();
		pooja.breath();

	}

}
