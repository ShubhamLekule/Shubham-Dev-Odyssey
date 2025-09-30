package com.studyeasy.interrupts;

public class App2 {
	public static int bal=0;
	
	private void withdrawLogic(int amt) {
		System.out.println("Amount to be Withdraw :"+amt);
		System.out.println("Balance before Withdrawing :"+bal);
		bal=bal-amt;
		System.out.println("Balance after Withdrawing :"+bal);
	}
	
	public void withdraw(int amt) {
		if(bal<=0 || bal<amt) {
			synchronized(this) {
			try {
				System.out.println("Wait() method called");
				wait();
			} catch (InterruptedException e) {
				System.out.println("Inside InterruptedException cath block");
				withdrawLogic(amt);
			}
			}
		}
		else {
			System.out.println("Withdraw else part");
			withdrawLogic(amt);
		}
	}
	
	public void deposit(int amt) {
		System.out.println("Amount to be deposit :"+amt);
		bal=bal+amt;
		System.out.println("Balance After deposit :"+bal);
	}
	
	public static void main(String[] args) {
		
		App2 a=new App2();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				a.withdraw(1000);
			}
		});
		t1.setName("Tread1");
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
				t1.interrupt();
			}
		});
		t2.setName("Tread2");
		t2.start();
		
	}

}
