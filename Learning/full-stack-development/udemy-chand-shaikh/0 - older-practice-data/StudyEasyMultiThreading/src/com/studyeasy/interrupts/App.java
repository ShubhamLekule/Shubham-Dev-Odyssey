package com.studyeasy.interrupts;

public class App {

	private static int amount =0;
	
	public void withdraw(int amt) {
		System.out.println("Inside withdraw");
		if(amount<=0) {
			synchronized(this) {
			try {
				System.out.println("Wait get called");
				wait();
				
			} catch (InterruptedException e) {
				System.out.println("Thread got Interrupted");
				return;
			}
			}
			App.amount=App.amount-amt;
			System.out.println("Amount in withdraw :"+amount);
		}
	}
	public static void main(String[] args) {
		App a=new App();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				a.withdraw(1000);
				
			}
			
		});
		t1.setName("Thread 1");
		t1.start();
		if(amount<=0) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t1.interrupt();
		}
		
	}

}
