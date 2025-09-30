package com.studyeasy.deadlocksPartOne;

public class App {

	public static void main(String[] args) {
		// below is the deadlock scenario creation
		String lock1="lock 1";
		String lock2="lock 2";
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(lock1) {
				System.out.println("Inside Thread 1 and lock 1");
				synchronized(lock2) {
					System.out.println("Inside Thread 1 and lock 2");
				}
				}
			}
			
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(lock2) {
				System.out.println("Inside Thread 2 and lock 2");
				synchronized(lock1) {
					System.out.println("Inside Thread 2 and lock 1");
				}
				}
				
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
