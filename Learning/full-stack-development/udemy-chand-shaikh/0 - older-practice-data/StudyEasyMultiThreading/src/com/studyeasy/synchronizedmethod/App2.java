package com.studyeasy.synchronizedmethod;

class Bracket{
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

public class App2 {

	public static void main(String[] args) {
		
		// Synchronization worked on same object or same shared resources,
		//in below example we created 2 diff obj so for b1 is synchronization work separately
		// and for b2 its work separately. below scenario again o/p is weird even though 
		// Synchronization is there.
		Bracket b1=new Bracket();
		Bracket b2=new Bracket();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++)
					b1.generate();
			}
			
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++)
					b2.generate();
			}
			
		}).start();
	}

}
