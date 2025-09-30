package com.udemy.arraylistcollection;

import java.util.ArrayList;

public class App2 {
	static ArrayList<String> names=new ArrayList<>();
	static int count=0; 
	public static void main(String[] args) {
		names.add("shubham");
		names.add("pooja");
		names.add("pikachu");
		System.out.println("address before remove:"+names.hashCode());
		names.add("shuki");
		App2 app=new App2();
		
		System.out.println("Original Array :");
		for(String name:names) {
			System.out.println("index ["+count+"] :"+name);
			count ++;
		}
		count=0;
		System.out.println("address before remove:"+names.hashCode());
		System.out.println("Array After app.removeByIndex(1):");
		app.removeNameByPosition(1);
		for(String name:names) {
			System.out.println("index ["+count+"] :"+name);
			count ++;
		}
		count=0;
		System.out.println("address after remove:"+names.hashCode());
		System.out.println("Array After app.removeNameByName(1):");
		app.removeNameByName("pikachu");
		for(String name:names) {
			System.out.println("index ["+count+"] :"+name);
			count ++;
		}
		count=0;
	}
	void removeNameByPosition(int index) {
		names.remove(index);
	}
	void removeNameByName(String name) {
		names.remove(names.indexOf(name));
	}
	
}

