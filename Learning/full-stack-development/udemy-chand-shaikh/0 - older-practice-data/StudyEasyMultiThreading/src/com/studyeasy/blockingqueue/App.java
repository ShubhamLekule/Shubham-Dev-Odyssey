package com.studyeasy.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;
	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				queue.put(App.counter++);
				System.out.println("Value added in the queue :"+App.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;
	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
				queue.take();
				App.counter--;
				System.out.println("Value Removed in the queue :"+App.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App {
	public static int counter;
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(4);
		Producer producer=new Producer(queue);
		Thread t1=new Thread(producer);
		t1.start();
		
		Consumer consumer=new Consumer(queue);
		Thread t2=new Thread(consumer);
		t2.start();
		
		
	}

}
