package com.practice.udemy.enums;

public class App {
	// Below example is without enum
	public static final int COREJAVA=1;
	public static final int COLLECTIONS=2;
	public static final int GENERICS=3;
	public static final int JSPANDSERVELETS=4;
	public static final int MULTITHREADING=5;
	
	public static void main(String[] args) {
		
		int learnings=COREJAVA;
		
		switch(learnings) {
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
