package com.practice.udemy.staticinnerclassparttwo.demo;

public class Outer {
	
	public int testVar=5;
	public static int testStaticVar=5;
	private void testOuterMethod() {
		System.out.println("Outer method get called");
	}
	private static void testStaticOuterMethod() {
		System.out.println("Outer static method get called");
		// calling value of inner class into the outer class
		System.out.println("Value of Inner class variable : "+Inner.x);
	
		
		
	}
	public static void testStaticOuterMethodToCallInnerMethod() {
		Inner.testingInnerMethodForOuterClass();
	}
	// True Inner class where everything is static
		public static class Inner{
			public static int x=0;
			public static void testingInnerMethod() {
				System.out.println("Inner Class get called");
				// we cannot direct access testVar , we need to create object using new keyword.
				// Another way is mark testVar as static variable
				// Anything which is not static can be called using new keyword.
				//Anything which is static can be called by class name
				System.out.println("Test Variable value is"+new Outer().testVar);
				System.out.println("Test Static Variable value is"+testStaticVar);
				testStaticOuterMethod();
				new Outer().testOuterMethod();
			}
			public static void testingInnerMethodForOuterClass() {
				System.out.println("Inner get called from Outer class");
			}
		}
}
