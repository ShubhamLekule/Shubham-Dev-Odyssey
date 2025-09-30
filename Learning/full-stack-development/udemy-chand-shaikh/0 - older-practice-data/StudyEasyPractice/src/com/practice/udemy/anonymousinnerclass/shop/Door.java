package com.practice.udemy.anonymousinnerclass.shop;

public class Door {
private Lock lock=new Lock() {
// This also can be achieved using non abstract class
	@Override
	public boolean isLocked(String key) {
		if(key.equals("qwerty"))
		return true;
		else
			return false;
	}
	
	
};
public Lock getLock() {
	return lock;
}
}
