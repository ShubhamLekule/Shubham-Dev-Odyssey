package com.practice.udemy.polymorphismPartOne;

import com.practice.udemy.polymorphismPartOne.phone.Nokia3310;
import com.practice.udemy.polymorphismPartOne.phone.Phone;
import com.practice.udemy.polymorphismPartOne.phone.SamsungNote8;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone=new Phone("Nokia 3310");
		System.out.println(phone.getModel());
		phone.features();

		
		SamsungNote8 note8=new SamsungNote8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		// Below two are basic example of polymorphism
		// In below example features method called from child class
		Phone noteSamsung=new SamsungNote8("Note 8");
		System.out.println(noteSamsung.getModel());
		noteSamsung.features();
		// In below example features method called from parent class
		Phone nokia3310=new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
	}

}
