package com.udemy.linkedlist;

import java.util.LinkedList;

public class App {
	static LinkedList<Integer> num=new LinkedList<>();
	public static void main(String[] args) {
		App a=new App();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50); 
		a.printList();
		System.out.println("**********************");
		num.add(1,21);
		a.printList();
		System.out.println("**********************");
		num.add(60);
		a.printList();
		System.out.println("**********************");
		num.remove(1);
		a.printList();
		//remove without index consider as 0th index
		System.out.println("**********************");
		num.remove();
		a.printList();
		System.out.println("**********************");
		num.set(1,21);
		a.printList();

	}
	void printList() {
		for(int x:num)
		System.out.println(x);
	}

}
