package com.studyeasy.waitandnotify;

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			App.amount=App.amount-amt;
			System.out.println("Amount in withdraw :"+amount);
		}
	}
	
	public void deposit(int amt) {
		App.amount=App.amount+amt;
		synchronized(this){
				notify();
			System.out.println("Amount in deposit :"+amount);
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
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a.deposit(2000);
				
			}
			
		});
		
		t2.setName("Thread 2");
		t2.start();
	}

}
