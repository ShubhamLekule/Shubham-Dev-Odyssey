package com.practice.udemy.stringsPartTwo;

public class App {

	public static void main(String[] args) {
		String str1="Awesome";
		String str2="Awesome";
		
		// when we create 1st string literal str1 java create heap memory to store "Awesome" string 
		// then java create str1 String variable in stack memory and give address of "Awesome" string from heap memory 
		// 	to str1.
		// when we create 2nd string literal str2 java check if "Awesome" string is already in heap memory or not.
		// if not then it will create new one if yes then it will reuse and give address of "Awesome" string to str2
		// string variable in stack memory.
		System.out.println("Result of str1==str2 operation : "+(str1==str2));
		
		// In below case with new keyword java always create new memory location inside heap memory.
		// in str3 string variable we creating "Awesome" string with new keyword so java create new memory location
		// and add memory address to str3 in stack memory. similarly it will do for str4. so now both str3 and str4 
		// having different address. in this case result of == will be false
		String str3=new String("Awesome");
		String str4=new String("Awesome");
		System.out.println("Result of str3==str3 operation : "+(str3==str4));
		
	}

}
