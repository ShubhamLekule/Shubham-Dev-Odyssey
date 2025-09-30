package com.udemy.sets.comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private K key;
	private V value;
	public Data(K key, V value) {

		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
}


public class App {

	public static void main(String[] args) {
		Comparator<Data<Integer,String>> KEY=new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getKey() < o2.getKey())
					return -1;
				else if(o1.getKey() > o2.getKey())
					return 1;
				else
				return 0;
			}
			
		};
		
		Comparator<Data<Integer,String>> VALUE=new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getValue().length() > o2.getValue().length())
					return 1;
				else if(o1.getValue().length() < o2.getValue().length())
					return -1;
				else
				return 0;
			}
			
		};
		
		// Result of below is might be difrrent in java 1.8
		Set<Data<Integer,String>> list1=new TreeSet<>(KEY);
		Set<Data<Integer,String>> list2=new TreeSet<Data<Integer,String>>(VALUE);
		list1.add(new Data<Integer,String>(1,"Shubham"));
		list1.add(new Data<Integer,String>(2,"Shubham"));
		list1.add(new Data<Integer,String>(3,"Pikachu"));
		list1.add(new Data<Integer,String>(4,"Pooja"));
		list1.add(new Data<Integer,String>(1,"Kiran"));
		
		list2.add(new Data<Integer,String>(1,"Shubham"));
		list2.add(new Data<Integer,String>(2,"Shubham"));
		list2.add(new Data<Integer,String>(3,"Pikachu"));
		list2.add(new Data<Integer,String>(4,"Pooja"));
		list2.add(new Data<Integer,String>(1,"Kiran"));
		
		for(Data<Integer,String> d:list1) {
			System.out.println(d);
		}
		System.out.println("*************************");
		for(Data<Integer,String> d:list2) {
			System.out.println(d);
		}
	}

}
