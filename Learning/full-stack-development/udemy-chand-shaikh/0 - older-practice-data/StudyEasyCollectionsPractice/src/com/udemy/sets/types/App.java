package com.udemy.sets.types;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		Set<String> set2=new LinkedHashSet<>();
		Set<String> set3=new TreeSet<>();
		for(int i=10;i>0;i--) {
			set1.add("A"+i);
			set2.add("A"+i);
			set3.add("A"+i);
		}
		for(String str:set1) {
			System.out.println(str);
		}
		System.out.println("*************************************");
		for(String str:set2) {
			System.out.println(str);
		}
		System.out.println("*************************************");
		for(String str:set3) {
			System.out.println(str);
		}
		
	}

}
