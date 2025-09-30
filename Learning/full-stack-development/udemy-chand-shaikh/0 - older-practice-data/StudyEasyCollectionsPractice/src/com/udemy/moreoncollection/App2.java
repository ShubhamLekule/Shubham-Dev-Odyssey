package com.udemy.moreoncollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// ArrayBlockingQueue to ArrayList
public class App2 {

	public static void main(String[] args) {
		Queue<Integer> queue=new ArrayBlockingQueue<>(6);
		queue.offer(1);
		queue.offer(6);
		queue.offer(7);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);//size is 6 so this line of code will not work
		for(Integer i:queue) {
			System.out.println(i);
		}
		System.out.println("*************************");
		List<Integer> list=new ArrayList<>();
		list.addAll(queue);
		for(Integer i:list) {
			System.out.println(i);
		}
	}

}
