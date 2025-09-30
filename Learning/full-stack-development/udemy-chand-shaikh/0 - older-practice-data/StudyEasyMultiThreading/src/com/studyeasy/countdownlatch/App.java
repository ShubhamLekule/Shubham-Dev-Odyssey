package com.studyeasy.countdownlatch;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread{
	private CountDownLatch latch;

	public SomeThread(CountDownLatch latch) {
		this.latch = latch;
	}
	@Override
	public void run() {
		System.out.println("Running Thread : "+Thread.currentThread().getName());
		System.out.println("Thread Stopped");
		System.out.println("***************************************************");
		latch.countDown();
	}
	
}

public class App {

	public static void main(String[] args) {
		CountDownLatch latch=new CountDownLatch(4);
		SomeThread t1=new SomeThread(latch);
		SomeThread t2=new SomeThread(latch);
		SomeThread t3=new SomeThread(latch);
		SomeThread t4=new SomeThread(latch);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In main Thread");
	}

}
