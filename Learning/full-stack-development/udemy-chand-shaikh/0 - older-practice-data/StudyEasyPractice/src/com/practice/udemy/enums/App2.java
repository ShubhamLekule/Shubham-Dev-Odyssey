package com.practice.udemy.enums;

public class App2 {

	public static void main(String[] args) {
		
		// java will apply type safety
		// on enum variable only the properties get accepted which define in enum
		Learning learn=Learning.COREJAVA;
		
		switch(learn) {
		case COLLECTIONS:
			System.out.println("Step : COLLECTIONS Learning");
			break;
		case COREJAVA:
			System.out.println("Step : COREJAVA Learning");
			break;
		case GENERICS:
			System.out.println("Step : GENERICS Learning");
			break;
		case JSPANDSERVELETS:
			System.out.println("Step : JSPANDSERVELETS Learning");
			break;
		case MULTITHREADING:
			System.out.println("Step : MULTITHREADING Learning");
			break;
		default:
			System.out.println("Nothing to learn");
		
		}

	}

}
