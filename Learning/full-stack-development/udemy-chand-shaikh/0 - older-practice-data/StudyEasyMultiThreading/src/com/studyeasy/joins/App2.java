package com.studyeasy.joins;

public class App2 {
public int count=0;
	
	public static void main(String[] args) {
		App2 a=new App2();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++)
					a.count++;
			}
		});
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				// In below current thread is t2 and reference thread is t1.
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i=0;i<1000;i++)
					a.count++;
			}
		});
		// t2 wait for t1 completion. main wait for t2 completion
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Value of Count : "+a.count);
	}

}
