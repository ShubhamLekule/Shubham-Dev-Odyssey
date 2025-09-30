package com.lambdaexpression.partFive;

import java.util.ArrayList;
import java.util.Collections;
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


public class App2 {

	public static void main(String[] args) {
		List<Data> list=new ArrayList<>();
		list.add(new Data("Shubham"));
		list.add(new Data("Pooja"));
		list.add(new Data("Kiran"));
		list.add(new Data("Ketaki"));
		list.add(new Data("Pikachu"));
		
		Collections.sort(list, (Data o1,Data o2)->o1.getName().compareTo(o2.getName()));
		
		list.forEach(temp->System.out.println("Name :"+temp.getName()));

	}

}
