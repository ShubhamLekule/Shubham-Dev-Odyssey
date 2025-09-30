package com.studyeasy.deadlocksPartTwo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Professional example to handle deadlock
public class App2 {

	public static void main(String[] args) {
		// below is the deadlock scenario creation
		Lock lock1=new ReentrantLock();
		Lock lock2=new ReentrantLock();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flagLock1=false;
				boolean flagLock2=false;
				boolean doneFlag1=false;
				boolean doneFlag2=false;
				while(true)
				{				
					try {
						if(!flagLock1)
						flagLock1=lock1.tryLock();
						if(!flagLock2)
						flagLock2=lock2.tryLock();
				} finally {
					if(flagLock1 && !doneFlag1) {
						System.out.println("Inside Thread 1 on lock 1");
					lock1.unlock();	
					doneFlag1=true;
					}
					if(flagLock2 && !doneFlag2) {
						System.out.println("Inside Thread 1 on lock 2");
						lock2.unlock();	
						doneFlag2=true;
					}
					if(flagLock1 && flagLock2)
						break;
				}
				}
			}
			
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				boolean flagLock1=false;
				boolean flagLock2=false;
				boolean doneFlag1=false;
				boolean doneFlag2=false;
				while(true)
				{				
					try {
						if(!flagLock1)
						flagLock1=lock1.tryLock();
						if(!flagLock2)
						flagLock2=lock2.tryLock();
				} finally {
					if(flagLock1 && !doneFlag1) {
						System.out.println("Inside Thread 2 on lock 1");
						lock1.unlock();
						doneFlag1=true;
					}
					if(flagLock2 && !doneFlag2) {
						System.out.println("Inside Thread 2 on lock 2");
						lock2.unlock();
						doneFlag2=true;
					}
						if(flagLock1 && flagLock2)
						break;
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
