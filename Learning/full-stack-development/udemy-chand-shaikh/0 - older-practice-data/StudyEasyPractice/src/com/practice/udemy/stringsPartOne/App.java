package com.practice.udemy.stringsPartOne;

public class App {

	public static void main(String[] args) {
		
		String x="awesome";
		String y="shubham";
		String z=x+y;
		
		// result of below is false, when we use "==" operator to compare it compare the reference of string instead 
		// of value of string. in below scenario reference of z string literal is different from actual 
		// "awesomeshubham" string
		System.out.println("Result of == operation : "+(z=="awesomeshubham"));
		
		// result of below is true, when we use ".equals()" method to compare it compare the value of string 
		// In below scenario value of z is "awesomeshubham".we comparing awesomeshubham to awesomeshubham so its true
		System.out.println("Result of .equals() operation : "+(z.equals("awesomeshubham")));
		
		
		System.out.println("Concat method : "+(x.concat(y)));
		System.out.println("replace method : "+(z.replace(x,"fantastic")));
	}

}
