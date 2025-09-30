package com.studyeasy.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	private String name;

	public SomeThread(String name) {

		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("Starting Thread : "+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Stoping Thread : "+name);
	}
	
}


public class App {

	public static void main(String[] args) {
		
		ExecutorService executer=Executors.newFixedThreadPool(8);
		
		SomeThread t1=new SomeThread("Thread 1");
		SomeThread t2=new SomeThread("Thread 2");
		SomeThread t3=new SomeThread("Thread 3");
		SomeThread t4=new SomeThread("Thread 4");
		SomeThread t5=new SomeThread("Thread 5");
		SomeThread t6=new SomeThread("Thread 6");
		SomeThread t7=new SomeThread("Thread 7");
		SomeThread t8=new SomeThread("Thread 8");
		SomeThread t9=new SomeThread("Thread 9");
		SomeThread t10=new SomeThread("Thread 10");
		SomeThread t11=new SomeThread("Thread 11");
		SomeThread t12=new SomeThread("Thread 12");
		SomeThread t13=new SomeThread("Thread 13");
		SomeThread t14=new SomeThread("Thread 14");
		SomeThread t15=new SomeThread("Thread 15");
		SomeThread t16=new SomeThread("Thread 16");
		
		executer.execute(t1);
		executer.execute(t2);
		executer.execute(t3);
		executer.execute(t4);
		executer.execute(t5);
		executer.execute(t6);
		executer.execute(t7);
		executer.execute(t8);
		executer.execute(t9);
		executer.execute(t10);
		executer.execute(t11);
		executer.execute(t12);
		executer.execute(t13);
		executer.execute(t14);
		executer.execute(t15);
		executer.execute(t16);
		
		executer.shutdown();
	}

}
