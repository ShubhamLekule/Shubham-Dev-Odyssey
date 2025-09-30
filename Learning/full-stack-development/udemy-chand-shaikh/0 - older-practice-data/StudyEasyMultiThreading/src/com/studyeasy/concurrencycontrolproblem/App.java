package com.studyeasy.concurrencycontrolproblem;

public class App {
public static int count=0;//It will be common for multiple Thread
static public void main(String[] args) {
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++)
					App.count++;
				System.out.println("Loop over in Thread 1");
			}
			
		});
		
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++)
					App.count++;
				System.out.println("Loop over in Thread 2");
			}
			
		});
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// result of below will change each time as we run bcoz two thread try to change
		// value of count variable simultaneously which causing issue to count++ operation
		System.out.println(App.count);
	}

}
