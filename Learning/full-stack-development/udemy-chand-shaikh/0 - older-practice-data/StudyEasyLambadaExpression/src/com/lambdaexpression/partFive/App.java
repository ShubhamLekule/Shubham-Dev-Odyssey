package com.lambdaexpression.partFive;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(50);
		list.add(25);
		list.add(22);
		list.add(61);
		list.add(8);
		
		// forEach don't required data type to be mentioned, it will auto detect the data type 
		list.forEach(i->System.out.println("Value of i : "+i));
		
		System.out.println("*************************************");
		
		list.forEach(i->{
			if(i<=25)
			System.out.println("Value of i : "+i);
		});

	}

}
