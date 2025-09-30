package com.udemy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		Map<Integer,String> student=new HashMap<>();
		//Map<Integer,String> student=new HashMap<>(10); we can provide size also to hashmap
		student.put(4,"Pikachu");
		student.put(1,"Shubham");
		student.put(2, "Pooja");
		student.put(3, "Kiran");
		//if we use same key which already used then the value will be override. duplicate 
		//key not allowed
		student.put(1, "AwesomeShubham");
		
		//one way to get data is Entry set/method
		for(Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("***********************************");
		//to print key only
		for(Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println("Key :"+entry.getKey());
		}
		System.out.println("***********************************");
		//to print value only
		for(Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println("Value :"+entry.getValue());
		}
		System.out.println("***********************************");
		//Retrieving value of particular key
		System.out.println("value of key 4 :"+student.get(4));
		System.out.println("***********************************");
		//Another way to get key value
		for(Integer key:student.keySet())
		System.out.println("key :"+key+" , value : "+student.get(key));
		System.out.println("***********************************");
		//Iterator way to get key value
		Iterator<Entry<Integer,String>> entry=student.entrySet().iterator();
		while(entry.hasNext()) {
			System.out.println(entry.next());
		}
		Iterator<Entry<Integer,String>> entry2=student.entrySet().iterator();
		System.out.println("***********************************");
		//In below scenario we are using next() twice, each time we use next() cursor move 
		// forward or move to next entry in map. this is an issue
		while(entry2.hasNext()) {
			System.out.println("Key : "+entry2.next().getKey()+" , Value : "+entry2.next().getValue());
		}
		// To resolve above issue write code like below
		Iterator<Entry<Integer,String>> entry3=student.entrySet().iterator();
		System.out.println("***********************************");
		while(entry3.hasNext()) {
			Entry<Integer,String> temp=entry3.next();
			System.out.println("Key : "+temp.getKey()+" , Value : "+temp.getValue());
		}
	}

}
