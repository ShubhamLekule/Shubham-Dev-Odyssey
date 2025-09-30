package com.practice.udemy.anonymousobject;

import com.practice.udemy.anonymousobject.shop.Door;

public class Shop {

	public static void main(String[] args) {
		
		//below is the example of anonymous object where we directly creating object with new keyword without
		// assigning to variable or reference
		if(new Door().isLocked(args[0]))
		{
			System.out.println("Door is unlocked");
		}else {
			System.out.println("Door is Locked");
		}
	
	}


	}

