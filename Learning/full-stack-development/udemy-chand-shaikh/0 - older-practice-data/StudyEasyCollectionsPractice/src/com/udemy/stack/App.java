package com.udemy.stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> num=new Stack<>();
		num.push(10);
		num.push(20);
		num.push(30);
		num.push(40);
		num.push(50);
		num.push(60);
		for(int x:num)
		System.out.println(x);
		System.out.println("*******************************");
		if(num.isEmpty()) {
			System.out.println("Stack don't have value init");
		}else {
			num.pop();
			for(int x:num)
				System.out.println(x);
			System.out.println( "Peek: "+num.peek());
			System.out.println( "Search: "+num.search(10));
		}
		

	}

}
