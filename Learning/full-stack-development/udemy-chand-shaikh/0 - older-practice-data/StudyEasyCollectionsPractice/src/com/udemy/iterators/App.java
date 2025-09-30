package com.udemy.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Shubham");
		list.add("Pooja");
		list.add("Shuki");
		list.add("Pikachu");
		list.add("Kiran");
		App a=new App();
		a.printList(list);

	}
	void printList(List<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
