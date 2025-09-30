package com.practice.udemy.localinnerclass;

import com.practice.udemy.localinnerclass.shop.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door();
		// Command line argument helps us to pass argument from outside the application
		// Use Drop down near the run button -> click on run configuration -> select the application -> 
		//click on arguments -> Inside program arguments give argument -> click on run
		// If we want to give multiple argument in command line argument use next line
		if(door.isLocked(args[0]))
		{
			System.out.println("Door is unlocked");
		}else {
			System.out.println("Door is Locked");
		}
		System.out.println(args[1]);
	}

}
