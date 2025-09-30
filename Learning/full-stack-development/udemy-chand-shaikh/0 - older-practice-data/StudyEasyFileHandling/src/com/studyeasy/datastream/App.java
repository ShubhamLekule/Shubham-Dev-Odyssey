package com.studyeasy.datastream;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//System.out output data stream
		System.out.println("Output data stream");
		//System.in Input data stream
		try (Scanner ip = new Scanner(System.in)) {
			int x=ip.nextInt();
			System.out.println(x);
		}
		//System.err Error data stream
		System.err.println("Error");
		
	}

}
