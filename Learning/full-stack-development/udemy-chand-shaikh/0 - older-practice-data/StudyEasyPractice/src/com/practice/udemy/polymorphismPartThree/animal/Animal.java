package com.practice.udemy.polymorphismPartThree.animal;

public class Animal {
	private double hight;
	private double weight;
	private String animalType;
	private String bloodType;

	public Animal(double hight, double weight, String animalType, String bloodType) {
		this.hight = hight;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public Animal() {
		this.hight = 0.01d;
		this.weight = 0.01d;
		this.animalType = "Not Mentioned";
		this.bloodType = "Not Mentioned";
	}

	public double getHight() {
		return hight;
	}

	public double getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	@Override
	public String toString() {
		return "Animal [getHight()=" + getHight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
