package com.udemy.arraylistcollection;

import java.util.ArrayList;

public class App {
	
	static ArrayList<String> names=new ArrayList<>();
	static int count=0; 
	
	public static void main(String[] args) {
	
		names.add("shubham");
		names.add("pooja");
		names.add("pikachu");
		names.add("shuki");
		App app=new App();
		
		System.out.println("Original ArrayList:");
		for(String name:names) {
			System.out.println("Index["+count+++"]"+name);
		}
		count=0;
		System.out.println("names.get(1) : "+names.get(1));
		System.out.println("*****************************");
		System.out.println("ArrayList after use removeByIndex(2):");
		app.removeByIndex(2);
		for(String name:names) {
			System.out.println("Index["+count+++"]"+name);
		}
		count=0;
		System.out.println("names.get(1) : "+names.get(1));
		System.out.println("*****************************");
		System.out.println("ArrayList after use removeByString(\"pooja\"):");
		app.removeByString("pooja");
		for(String name:names) {
			System.out.println("Index["+count+++"]"+name);
		}
		count=0;
		System.out.println("names.get(1) : "+names.get(1));

	}
	void removeByIndex(int index) {
		names.remove(index);
		
	}
	void removeByString(String name) {
		names.remove(name);
	}

}
