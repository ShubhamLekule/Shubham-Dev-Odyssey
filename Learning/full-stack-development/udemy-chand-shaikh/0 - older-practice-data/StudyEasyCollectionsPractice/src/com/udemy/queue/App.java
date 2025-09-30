package com.udemy.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedBlockingQueue<>();
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);
		
		Queue<Integer> queue2=new ArrayBlockingQueue<>(4);
		queue2.add(1);
		queue2.add(2);
		queue2.add(3);
		queue2.add(4);
		//queue2.add(5);  : can't add bcoz size 4 is mentioned, it will throw error
		queue2.offer(5);//this will not throw error it return false as size is 4.
		
		//method like offer() poll() and peek() will not throw error but method like
		//add() remove() and element() will throw error for particular scenario
		
		for(int i:queue1) {
			System.out.println(i);
		}
		System.out.println("*****************************");
		for(int i:queue2) {
			System.out.println(i);
		}
	}

}
