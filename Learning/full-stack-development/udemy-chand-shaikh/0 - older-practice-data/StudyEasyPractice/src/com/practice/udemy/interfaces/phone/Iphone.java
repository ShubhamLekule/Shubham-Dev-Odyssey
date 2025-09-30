package com.practice.udemy.interfaces.phone;

public class Iphone implements Phone {

	@Override
	public String processor() {
		// TODO Auto-generated method stub
		return "A13";
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "Iphone 13";
	}

	@Override
	public int spaceInGB() {
		// TODO Auto-generated method stub
		return 256;
	}

}
