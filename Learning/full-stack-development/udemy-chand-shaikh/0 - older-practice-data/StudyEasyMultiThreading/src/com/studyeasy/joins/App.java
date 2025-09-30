package com.studyeasy.joins;

public class App {
	public int count=0;
	
	public static void main(String[] args) {
		App a=new App();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++)
					a.count++;
			}
		});
		t1.start();
		// join() will join the current thread with the thread with the reference. in below 
		// scenario main thread is the current thread and t1 is the thread with reference.
		// In below case main will stop until t1 finish its work.
 		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Value of Count : "+a.count);
	}

}
