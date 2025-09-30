package com.practice.udemy.anonymousinnerclass;

import com.practice.udemy.anonymousinnerclass.shop.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door=new Door();
		if(door.getLock().isLocked(args[0])) 
			System.out.println("Door is Locked");
		else
			System.out.println("Door is Unlocked");
	}

}
