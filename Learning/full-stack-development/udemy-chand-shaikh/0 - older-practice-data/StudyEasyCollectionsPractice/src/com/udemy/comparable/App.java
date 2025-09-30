package com.udemy.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



class Names implements Comparable<Names>{
	private String name;
	
	public Names(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	//compareTo using to sort list based on length
	@Override
	public int compareTo(Names o) {
		if(name.length()==o.name.length())
			return 0;
		else if(name.length()<o.name.length())
			return -1; // For reverse:return 1
		else
		return 1;// For reverse:return -1
	}
	
}
public class App {

	public static void main(String[] args) {
		List<Names> list=new ArrayList<>();
		list.add(new Names("Shubham"));
		list.add(new Names("Pooja"));
		list.add(new Names("Shuki"));
		list.add(new Names("Pikachu"));
		list.add(new Names("Kiran"));
		App a=new App();
		a.printList(list);
		System.out.println("***********************");
		Collections.sort(list);
		a.printList(list);

	}
	void printList(List<Names> list) {
		Iterator<Names> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

}
}