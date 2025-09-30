package com.practice.udemy.finalkeyword.finalmethod;

public class B extends A {
private final int x=1;

public int getX() {
	return x;
}
// We cannot override the final method from parent class to child class
/*
 * @Override public void india() { System.out.println("Hello India Whats up"); }
 */
}
