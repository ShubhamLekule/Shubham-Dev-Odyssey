package com.practice.udemy.abstractclass;

import com.practice.udemy.abstractclass.person.NonVeganPerson;
import com.practice.udemy.abstractclass.person.Person;
import com.practice.udemy.abstractclass.person.VeganPerson;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person shubham=new NonVeganPerson();
		shubham.speak();
		shubham.eat();
		
		Person pooja=new VeganPerson();
		pooja.speak();
		pooja.eat();
	}

}
