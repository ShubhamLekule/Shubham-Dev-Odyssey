package com.studyeasy.volatilekeyworduse;

public class App {
	//when we mark variable as volatile that means we explicitly marking this variable as
	//no cache variable for thread
	public volatile static int flag=0;
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					if(flag==0)
						System.out.println("Running");
					else {
						System.out.println("Stop Running");
						break;
					}
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				App.flag=1;
				System.out.println("Flag value updated");
			}
			
		}).start();
		
	}

}
