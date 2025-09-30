package com.udemy.sortingandreversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Shubham");
		list.add("Pooja");
		list.add("Shuki");
		list.add("Pikachu");
		list.add("Kiran");
		
		for(String str:list)
			System.out.println(str);
		System.out.println("************************");
		list.sort(null);
		for(String str:list)
			System.out.println(str);
		System.out.println("************************");
		Collections.reverse(list);
		for(String str:list)
			System.out.println(str);
		System.out.println("************************");

	}

}
