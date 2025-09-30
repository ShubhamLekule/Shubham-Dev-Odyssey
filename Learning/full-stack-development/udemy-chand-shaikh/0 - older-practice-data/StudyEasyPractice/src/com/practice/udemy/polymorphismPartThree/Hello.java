package com.practice.udemy.polymorphismPartThree;

import java.util.ArrayList;
import java.util.List;

import com.practice.udemy.polymorphismPartThree.animal.Animal;
import com.practice.udemy.polymorphismPartThree.bird.Bird;
import com.practice.udemy.polymorphismPartThree.bird.Eagle;
import com.practice.udemy.polymorphismPartThree.fish.Eel;
import com.practice.udemy.polymorphismPartThree.fish.Fish;
import com.practice.udemy.polymorphismPartThree.reptile.Crocodile;
import com.practice.udemy.polymorphismPartThree.reptile.Reptile;

public class Hello {

	public static void main(String[] args) {
		// List of Animals can contain all child classed like bird fish reptile Eagle etc. 
		//but list of child class cannot contain parent and other child class excepts its own child class
		// example list of bird can contain eagle but not Animal reptile fish Eel etc.
		List<Animal> animal = new ArrayList<>();
		Animal a = new Animal();
		// Below examples are Sub-class reference inside super class object
		Bird b = new Bird();
		Reptile r = new Reptile();
		Fish f = new Fish();
		Eagle e = new Eagle();
		Eel el = new Eel();
		Crocodile c = new Crocodile();
		// in case of method declared in child class priority goes to child class . 
		//if its not declared then method gets called from parent class this called smart switching
		
		animal.add(a);
		animal.add(b);
		animal.add(r);
		animal.add(f);
		animal.add(e);
		animal.add(el);
		animal.add(c);
		// Animal object can contain any sub-class object
		//
		listAnimals(animal);
	}
	public static void listAnimals(List<Animal> animals) {
		int count=0;
		for(Animal animal:animals) {
			System.out.println("Count : "+ ++count);
			animal.showInfo();
		}
	}

}
