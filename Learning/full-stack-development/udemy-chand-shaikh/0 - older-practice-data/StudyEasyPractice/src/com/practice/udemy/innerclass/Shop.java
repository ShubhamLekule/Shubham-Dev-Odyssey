package com.practice.udemy.innerclass;

import com.practice.udemy.innerclass.shop.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Door door=new Door();
door.shopStatus();
door.getLock().setLock(false);
door.shopStatus();
	}

}
