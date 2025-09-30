package com.lambdaexpression.partThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		List<Data> list=new ArrayList<>();
		list.add(new Data("Shubham"));
		list.add(new Data("Pooja"));
		list.add(new Data("Ketaki"));
		list.add(new Data("Kiran"));
		list.add(new Data("Pikachu"));
		//1st approach without lambda expression
//		Collections.sort(list,new Comparator<Data>() {
//
//			@Override
//			public int compare(Data o1, Data o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		});/
		//2nd approach with lambda expression
//		Collections.sort(list,(Data o1, Data o2)->(o1.getName().compareTo(o2.getName())));
		
		//3rd approach with lambda expression 
//		Collections.sort(list,(Data o1, Data o2)->{
//			return o1.getName().compareTo(o2.getName());
//			});
		
		
		//4th approach with lambda expression and custom logic
		Collections.sort(list,(Data o1, Data o2)->{
			if(o1.getName().length()<o2.getName().length())
			return -1;
			else if(o1.getName().length()>o2.getName().length())
				return 1;
			else 
				return 0;
			});
		
		for(Data data:list) {
			System.out.println(data.getName());
		}
	}

}
