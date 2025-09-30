package com.studyeasy.trywithresources;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// in below case Scanner use without try so closing it manually mandatory
		/*
		 * Scanner ip=new Scanner(System.in);
		 * System.out.println("1st input"+ip.nextInt()); ip.close();
		 */
		
		// in below case Scanner use with try so closing it manually not mandatory
		// catch block also optional with try resource
		try(Scanner ip2=new Scanner(System.in)){
			System.out.println("Enter second input");
			System.out.println("2nd input"+ip2.nextInt());
		}
		
	}

}
