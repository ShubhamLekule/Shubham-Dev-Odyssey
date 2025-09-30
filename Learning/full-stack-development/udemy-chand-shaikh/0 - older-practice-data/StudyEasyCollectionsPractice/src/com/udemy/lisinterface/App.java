package com.udemy.lisinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		App a=new App();
		List<String> list1=new ArrayList<>();
		list1.add("India");
		list1.add("UK");
		list1.add("UAE");
		list1.add("ASIA");
		a.printList(list1);
		
		List<String> list2=new LinkedList<>();
		list2.add("Shubham");
		list2.add("Pooja");
		list2.add("Shuki");
		list2.add("Pikachu");
		a.printList(list2);

	}
	void printList(List<String> list) {
		for(String str:list)
		System.out.println(str);
		System.out.println("*************************");
	}
}
