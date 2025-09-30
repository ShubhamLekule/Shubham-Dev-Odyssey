package com.udemy.moreoncollection;
// HashSet to ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Names implements Comparable<Names>{
	private String name;

	public Names(String name) {
	
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Names other = (Names) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Names [name=" + name + "]";
	}

	@Override
	public int compareTo(Names o) {
		// TODO Auto-generated method stub
		return getName().compareTo(o.getName());
	}
	
	
}

public class App {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Shubham");
		set.add("Pooja");
		set.add("Shuki");
		set.add("Kiran");
		set.add("Shubham");
		
		for(String i:set) {
			System.out.println(i);
		}
		System.out.println("**********************");
		// List contain repeating entry but in set its not repeating , so while adding entry 
		// in Set second shubham got eliminated and in list we only see one Shubham
		List<String> list=new ArrayList<>();
		list.addAll(set);
		for(String i:list) {
			System.out.println(i);
		}
		Collections.sort(list);
		System.out.println("**********************");
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("**********************");
		// Binary search is capable of searching any collections
		//below return index of element , if not present return minus value
		System.out.println(Collections.binarySearch(list, "Shubham"));
		System.out.println(Collections.binarySearch(list, "test"));
		
		System.out.println("**********************");
		
		List<Names> names=new ArrayList<>();
		names.add(new Names("Shubham"));
		names.add(new Names("Pooja"));
		names.add(new Names("Shuki"));
		names.add(new Names("Kiran"));
		names.add(new Names("Shubham"));
		Collections.sort(names);
		for(Names nm:names) {
			System.out.println(nm);
		}
		System.out.println("**********************");
		System.out.println(Collections.binarySearch(names, new Names("Shubham")));
	}

}
