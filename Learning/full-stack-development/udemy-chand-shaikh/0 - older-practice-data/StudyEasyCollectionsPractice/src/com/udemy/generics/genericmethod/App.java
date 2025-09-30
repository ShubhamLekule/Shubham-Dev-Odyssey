package com.udemy.generics.genericmethod;

import java.util.ArrayList;
import java.util.List;

class Data{
	// instead of mention below <E> we can mention to the class also like "class Data<E>{"
	public <E> void printListData(List<E> list) {
		for(E element: list) {
			System.out.println(element);
		}
	
	}
	public <E> void printArrayData(E[] arrData) {
		for(E element:arrData) {
			System.out.println(element);
		}
	}
}


public class App {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Data data=new Data();
		data.printListData(list);
		
		List<String> list2 =new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		data.printListData(list2);
		String[] strArr= {"Shubham","Kiran"};
		Integer[] intArr= {1,2,3,4};
		data.printArrayData(strArr);
		data.printArrayData(intArr);
	}

}
