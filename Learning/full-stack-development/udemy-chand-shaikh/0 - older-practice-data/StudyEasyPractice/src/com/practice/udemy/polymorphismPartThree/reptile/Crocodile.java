package com.practice.udemy.polymorphismPartThree.reptile;

public class Crocodile extends Reptile{
	private boolean hardShelledEggs;

	public Crocodile(double hight, double weight, String animalType, String bloodType, boolean drySkin,
			boolean backbone, boolean softShelledEgg, boolean hardShelledEggs) {
		super(hight, weight, animalType, bloodType, drySkin, backbone, softShelledEgg);
		this.hardShelledEggs = hardShelledEggs;
	}

	public Crocodile() {
		super();
	}

	public boolean getHardShelledEggs() {
		return hardShelledEggs;
	}

	@Override
	public String toString() {
		return "Crocodile [getHardShelledEggs()=" + getHardShelledEggs() + ", getDrySkin()=" + getDrySkin()
				+ ", getBackbone()=" + getBackbone() + ", getSoftShelledEgg()=" + getSoftShelledEgg() + ", toString()="
				+ super.toString() + ", getHight()=" + getHight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
