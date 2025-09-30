package com.udemy.dequeue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class App {

	public static void main(String[] args) {
		Deque<Integer> deque=new LinkedBlockingDeque<>();
		deque.offer(1);
		deque.offer(2);
		deque.offer(3);
		deque.offer(4);
		for(int i:deque)
		System.out.println(i);
		System.out.println("***************************");
		deque.addLast(6);
		for(int i:deque)
			System.out.println(i);
			System.out.println("***************************");
		deque.addFirst(0);
		for(int i:deque)
			System.out.println(i);
			System.out.println("***************************");
	}

}
