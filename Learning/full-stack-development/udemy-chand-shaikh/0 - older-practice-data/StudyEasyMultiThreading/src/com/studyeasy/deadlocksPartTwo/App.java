package com.studyeasy.deadlocksPartTwo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// Another example of deadlock
public class App {

	public static void main(String[] args) {
		// below is the deadlock scenario creation
		Lock lock1=new ReentrantLock();
		Lock lock2=new ReentrantLock();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				lock1.lock();
				System.out.println("Inside Thread 1 and lock 1");
				lock2.lock();
				System.out.println("Inside Thread 1 and lock 2");
				lock2.unlock();
				lock1.unlock();
			}
			
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock2.lock();
				System.out.println("Inside Thread 2 and lock 2");
				lock1.lock();
				System.out.println("Inside Thread 2 and lock 1");
				lock1.unlock();
				lock2.lock();
				
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside main method");
	}
}
