package com.studyeasy.implrunnableinterface;

import java.util.Random;

class Counter implements Runnable{
	private int threadNo;

	public Counter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		Random rand=new Random();
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(rand.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i : "+i+" , thread No. : "+threadNo);
	}}
}

public class App {

	public static void main(String[] args) {
		Counter count1=new Counter(1);
		Counter count2=new Counter(2);
		Thread t1=new Thread(count1);
		Thread t2=new Thread(count2);
		t1.start();
		t2.start();
		// If we going to use Thread only once we can use anonymous object
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
					System.out.println("New Annonymous Thread:"+i);
				
			}
			
		}).start();
	}

}
