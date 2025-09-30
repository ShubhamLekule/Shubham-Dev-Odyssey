package com.practice.udemy.staticinnerclasspartone.demo;

public class Outer {
	// True Inner class where everything is static
	public static class Inner{
		public static int x=0;
		public static void testingInnerMethod() {
			System.out.println("Inner Class get called");
		}
	}
}
