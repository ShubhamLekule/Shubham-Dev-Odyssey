package com.practice.udemy.interfaces.phone;

public class OnePlus implements Phone {

	@Override
	public String processor() {
		
		return "SD3310";
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "One Plus 8";
	}

	@Override
	public int spaceInGB() {
		// TODO Auto-generated method stub
		return 1024;
	}

}
