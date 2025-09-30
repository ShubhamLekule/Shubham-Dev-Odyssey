package com.studyeasy.extendingthreadclass;

class Counter extends Thread{
	private int threadNo;

	public Counter(int threadNo) {
		this.threadNo = threadNo;
	}
	public void countMe() {
		for(int i=1;i<=5;i++) {
			try {
				sleep(500);// process stop for given time using sleep() method
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i : "+i+" , thread No. : "+threadNo);
		}
	}
	@Override
	public void run() {
		countMe();
	}
}

public class App {

	public static void main(String[] args) {
		Counter count1=new Counter(1);
		Counter count2=new Counter(2);
		long startTime=System.currentTimeMillis();
		//count1.run();// when we call this run() explicitly there is no impact on program execution
		// it will execute like normal program
		count1.start();// this means this call run() method by JVM
		System.out.println("**********************************");
		//count2.run();
		count2.start();
		// when use start() method thread1 and thread2 work simultaneously and independently 
		
		//below sleep is for main method
		try {
			Thread.sleep(4505);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long endTime=System.currentTimeMillis();
		System.out.println("Total time taken to complete process : "+(endTime-startTime));
		
	}

}
