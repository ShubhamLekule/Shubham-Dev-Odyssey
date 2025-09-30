package com.udemy.generics.partTwo;

import java.util.LinkedList;
import java.util.List;


// here T is Type
class Data<T>{
	private T data;

	public Data(T data) {

		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		
	List<Data<Object>> elements=new LinkedList<>();
	elements.add(new Data<Object>("Shubham"));
	elements.add(new Data<Object>(8));
	elements.add(new Data<Object>(26.02f));
	elements.add(new Data<Object>('$'));
	elements.add(new Data<Object>(1995));
	
	App app=new App();
	app.printList(elements);
	}
	void printList(List<Data<Object>> list) {
		for(Data<Object> obj:list) {
			System.out.println(obj.getData());
		}
	}
}
