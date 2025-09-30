package com.udemy.sets;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Set<String> set =new HashSet<>();
		set.add("Shubham");
		set.add("Pikachu");
		set.add("Shubham");
		set.add("Kiran");
		set.add("Shubham");
		set.add("Pooja");
		for(String str:set) {
			System.out.println(str);
		}
		System.out.println(set.contains("Shubham"));
	}

}
