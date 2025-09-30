package com.practice.udemy.callbyvalueandreference;

public class App {

	public static void main(String[] args) {
		int callByVal=10;
		App app=new App();
		System.out.println("Current value of call by value In Main():"+callByVal);
		app.displayValueUsingCallByValue(callByVal);
		System.out.println("Current value of call by value after "
				+ "displayValueUsingCallByValue method call In Main(): :"
		+callByVal);
		
		System.out.println("**************************************");
		
		String[] names= {"shubham", "pikachu","pooja"};
		System.out.println("Array names in main():");
		for(String name:names) {
			System.out.println(name);
		}
		app.displayValueUsingCallByRef(names);
		System.out.println("Array names in main()after displayValueUsingCallByRef method call:");
		for(String name:names) {
			System.out.println(name);
		}

	}
	void displayValueUsingCallByValue(int value) {
		System.out.println("current value of callByVal variable in displayValue method is:"+value );
		value=20;
		System.out.println("changed value of callByVal variable in displayValue method is:"+value );
		
	}
	void displayValueUsingCallByRef(String[] names) {
		System.out.println("current value of variable in displayValueUsingCallByRef method is:" );
		for(String name:names) {
			System.out.println(name);
		}
		names[1]="shuki";
		System.out.println("Changed value of variable in displayValueUsingCallByRef method is:" );
		for(String name:names) {
			System.out.println(name);
		}
	}
}
