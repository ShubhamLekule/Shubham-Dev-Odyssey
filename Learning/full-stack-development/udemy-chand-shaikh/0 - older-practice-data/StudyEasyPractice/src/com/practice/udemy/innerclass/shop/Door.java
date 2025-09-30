package com.practice.udemy.innerclass.shop;

public class Door {
private Lock lock;

public Door() {
	super();
	this.lock = new Lock(true);
}
public void shopStatus() {
	if(lock.isLock()) {
		System.out.println("Shope is Closed. Please visit later");
	}else {
		System.out.println("Welcome, Shop is Open");
	}
}
public Lock getLock() {
	return lock;
}
public class Lock{
	private boolean isLock;

	public Lock(boolean isLock) {
		super();
		this.isLock = isLock;
	}

	public boolean isLock() {
		return isLock;
	}

	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}
	
}
}
