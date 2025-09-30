package com.studyeasy.readingwithscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=null;
		
			try {
				sc=new Scanner(new File("studyeasy/team.txt"));
				String line;
				while(sc.hasNext()) {
					line=sc.next();
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.err.println("File Not Found Exception");
			}finally {
				sc.close();
			}
			
		

	}

}
