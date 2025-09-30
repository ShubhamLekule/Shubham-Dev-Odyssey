package com.studyeasy.writingintofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file=new File("studyeasy");
		file.mkdir();
		file=new File("studyeasy/team.txt");
		// to write into file with buffer writer no need to create file using below try
		// catch code. buffer writer auto create file if file is not present
		try {
			file.createNewFile();
			System.out.println("File Created !!!!");
		} catch (IOException e) {
			System.out.println("Error Occured during file creation");
		}
		//new FileWriter(file) without append write into file
		//new FileWriter(file,true) append into file
		
		// below is the one way to use try method
		/*
		 * try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){
		 * bw.write("Shubham"); bw.newLine(); bw.write("Pooja"); bw.newLine();
		 * bw.write("Pikachu"); bw.newLine(); bw.write("Kiran");
		 * System.out.println("Writing into file completed"); }
		 */ 
		//below with try block
		BufferedWriter bw=null;
		try{
			bw=new BufferedWriter(new FileWriter(file,true));
			bw.write("Shubham");
			bw.newLine();
			bw.write("Pooja");
			bw.newLine();
			bw.write("Pikachu");
			bw.newLine();
			bw.write("Kiran");
			System.out.println("Writing into file completed");
		} catch (IOException e) {
			System.out.println("Error Occured while writing into the file");
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
