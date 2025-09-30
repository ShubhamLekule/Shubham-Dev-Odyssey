package com.practice.udemy.finalkeyword.finalvariable;

public class B extends A {
private final int x=5;
private final int y;

//final Variable only assign once in his lifetime so below will not work as we assign 5 to final variable x
/*
 * public B(int x) { super(); this.x = x; }
 */

// Below Constructor work as we have not assign any value to final variable y
public B(int y) { 
	super(); 
	this.y = y; 
	}


//If we mark property or variable as Final then we cannot use setter method for that property or variable
/*
 * public void setX(int x) { this.x = x; }
 */


// Default constructor will not work as we need to assign all final variable to make work default constructor
// In this case final variable y is not assign so it will not work if we assign value to final variable y it
// will work
/*
 * public B() { super(); }
 */

public int getX() {
	return x;
}



}
