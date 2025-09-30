package com.practice.udemy.polymorphismPartThree.bird;

import com.practice.udemy.polymorphismPartThree.animal.Animal;

public class Bird extends Animal{
	private double animalWithFeather;
	private double canFly;

	public Bird(double hight, double weight, String animalType, String bloodType, double animalWithFeather,
			double canFly) {
		super(hight, weight, animalType, bloodType);
		this.animalWithFeather = animalWithFeather;
		this.canFly = canFly;
	}

	public Bird() {
		super();
	}

	public double getAnimalWithFeather() {
		return animalWithFeather;
	}

	public double getCanFly() {
		return canFly;
	}

	@Override
	public String toString() {
		return "Bird [getAnimalWithFeather()=" + getAnimalWithFeather() + ", getCanFly()=" + getCanFly()
				+ ", getHight()=" + getHight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
