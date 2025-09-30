package com.practice.udemy.interfaces;

import java.util.Scanner;

import com.practice.udemy.interfaces.phone.Iphone;
import com.practice.udemy.interfaces.phone.OnePlus;
import com.practice.udemy.interfaces.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter model 1: OnePlus and 2: Iphone");
		Scanner ip=new Scanner(System.in);
		int mobile=ip.nextInt();
		Phone phone=modelName(mobile);
		System.out.println("Processor : "+phone.processor());
		System.out.println("Space in GB :"+phone.spaceInGB());
		System.out.println("Model : "+phone.model());

	}
	public static Phone modelName(int model) {
		switch(model) {
		case 1:
			return new OnePlus();
		case 2:
			return new Iphone();
			default:
				return null;
		}
	}

}
