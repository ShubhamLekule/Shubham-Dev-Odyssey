package com.practice.udemy.polymorphismPartThree.reptile;

import com.practice.udemy.polymorphismPartThree.animal.Animal;

public class Reptile extends Animal{
	private boolean drySkin;
	private boolean backbone;
	private boolean softShelledEgg;

	public Reptile(double hight, double weight, String animalType, String bloodType, boolean drySkin, boolean backbone,
			boolean softShelledEgg) {
		super(hight, weight, animalType, bloodType);
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.softShelledEgg = softShelledEgg;
	}

	public Reptile() {
		super();
		this.drySkin = false;
		this.backbone = false;
		this.softShelledEgg = false;

	}

	public boolean getDrySkin() {
		return this.drySkin;
	}

	public boolean getBackbone() {
		return this.backbone;
	}

	public boolean getSoftShelledEgg() {
		return this.softShelledEgg;
	}

	@Override
	public String toString() {
		return "Reptile [getDrySkin()=" + getDrySkin() + ", getBackbone()=" + getBackbone() + ", getSoftShelledEgg()="
				+ getSoftShelledEgg() + ", getHight()=" + getHight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
