package com.practice.udemy.polymorphismPartThree.fish;

import com.practice.udemy.polymorphismPartThree.animal.Animal;

public class Fish extends Animal{
	private double livesInWater;
	private double hasGills;

	public Fish(double hight, double weight, String animalType, String bloodType, double livesInWater,
			double hasGills) {
		super(hight, weight, animalType, bloodType);
		this.livesInWater = livesInWater;
		this.hasGills = hasGills;
	}

	public Fish() {
		super();
	}

	public double getLivesInWater() {
		return livesInWater;
	}

	public double getHasGills() {
		return hasGills;
	}

	@Override
	public String toString() {
		return "Fish [getLivesInWater()=" + getLivesInWater() + ", getHasGills()=" + getHasGills() + ", getHight()="
				+ getHight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
