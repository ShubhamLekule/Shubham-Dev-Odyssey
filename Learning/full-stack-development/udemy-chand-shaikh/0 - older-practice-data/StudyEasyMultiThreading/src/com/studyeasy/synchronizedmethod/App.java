package com.studyeasy.synchronizedmethod;

class Brackets{
	//without Synchronization output will be weird, this output dependent on hardware , jvm 
	// etc performance without Synchronization there is no control on output
	synchronized public void generate() {
		for(int i=0;i<10;i++)
			if(i<5)
				System.out.print("[");
			else 
				System.out.print("]");
		System.out.println();
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Brackets b=new Brackets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++)
					b.generate();
			}
			
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++)
					b.generate();
			}
			
		}).start();
	}

}
