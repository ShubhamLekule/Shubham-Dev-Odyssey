package com.practice.udemy.userinput;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		//->When we press enter without giving text on console it will take blank as value
		//->After nextLine if we trying to take any value through scanner it will not take as after pressing 
		//enter it will add black value to scanner for next input
		String name=ip.nextLine();
		System.out.println("Name : "+name);
		String name1=ip.next();
		System.out.println("Name : "+name1);
		int age=ip.nextInt();
		System.out.println("Age : "+age);
		ip.close();
	}

}
