package com.studyeasy.synchronizedblock;

/*below times are approx time for below code
Time with synchronized block:
Time Required for Thread 1: 12776
Time Required for Thread 2: 12777

Time with synchronized method:
Time Required for Thread 1: 12724
Time Required for Thread 2: 25422*/

class Brackets{

	  public void generate() {
		synchronized(this) {
		 for(int i=0;i<10;i++)
			if(i<5)
				System.out.print("[");
			else 
				System.out.print("]");
		System.out.println();
		}
		for(int j=0;j<5;j++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Brackets b=new Brackets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=1;i<=5;i++)
					b.generate();
				System.out.println("Time Required for Thread 1: "+(System.currentTimeMillis()-startTime));
			}
			
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=1;i<=5;i++)
					b.generate();
				System.out.println("Time Required for Thread 2: "+(System.currentTimeMillis()-startTime));
			}
			
		}).start();
	}

}