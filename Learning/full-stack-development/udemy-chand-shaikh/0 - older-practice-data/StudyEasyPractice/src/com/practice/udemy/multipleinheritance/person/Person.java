package com.practice.udemy.multipleinheritance.person;

public abstract class Person implements IsAlive,LiveLife{
public void speak() {
	System.out.println("Share his / her thoughts");
}
public abstract void eat();
@Override
public void breath() {
	System.out.println("Be Alive and remain living");
}
@Override
public void message() {
	System.out.println("Life is journey, keep moving and meet new people");
}
}
