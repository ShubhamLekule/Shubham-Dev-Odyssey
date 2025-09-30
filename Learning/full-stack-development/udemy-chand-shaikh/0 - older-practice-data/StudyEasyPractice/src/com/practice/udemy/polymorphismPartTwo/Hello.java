package com.practice.udemy.polymorphismPartTwo;


import com.practice.udemy.polymorphismPartTwo.phone.Nokia;
import com.practice.udemy.polymorphismPartTwo.phone.Phone;
import com.practice.udemy.polymorphismPartTwo.phone.Samsung;
import java.util.Scanner; 

public class Hello {

	public static void main(String[] args) {
		// Below two are basic example of polymorphism
				// In below example features method called from child class
				Phone noteSamsung=new Samsung("Note 8");
				System.out.println(noteSamsung.getModel());
				noteSamsung.features();
				// In below example features method called from parent class
				Phone nokia3310=new Nokia("Nokia 3310");
				System.out.println(nokia3310.getModel());
				nokia3310.features();
				System.out.println("*************************************************");
				
				// below is the example of runtime polymorphism
				System.out.println("Enter Daily Driver 1: Nokia and 2: Samsung");
				Scanner ip=new Scanner(System.in);
				int dd=ip.nextInt();
				Phone phone= new Hello().phone(dd);
				System.out.println(phone.getModel());
				phone.features();
				

	}
	
	public Phone phone(int dailyDriver) {
		// in case of return no need to add break
		switch(dailyDriver) {
		case 1:
			return new Nokia("3310");
		case 2:
			return new Samsung("Note 5");
		default:
				return null;
		}
	}

}
