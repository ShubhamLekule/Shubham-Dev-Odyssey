package com.practice.udemy.polymorphismPartThree.fish;

public class Eel extends Fish{
	private double releaseElectricCharge;

	public Eel(double hight, double weight, String animalType, String bloodType, double livesInWater, double hasGills,
			double releaseElectricCharge) {
		super(hight, weight, animalType, bloodType, livesInWater, hasGills);
		this.releaseElectricCharge = releaseElectricCharge;
	}

	public Eel() {
		super();
	}

	public double getReleaseElectricCharge() {
		return releaseElectricCharge;
	}

	@Override
	public String toString() {
		return "Eel [getReleaseElectricCharge()=" + getReleaseElectricCharge() + ", getLivesInWater()="
				+ getLivesInWater() + ", getHasGills()=" + getHasGills() + ", toString()=" + super.toString()
				+ ", getHight()=" + getHight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
