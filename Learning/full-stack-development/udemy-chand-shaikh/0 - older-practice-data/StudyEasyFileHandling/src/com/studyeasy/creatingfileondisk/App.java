package com.studyeasy.creatingfileondisk;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// Below is relative path
		File file=new File("src/demo.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Below is the absolute path
		File file1=new File("D:\\IDE\\sts-4.19.0.RELEASE\\workspace\\StudyEasyFileHandling\\src\\demo1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File created");

	}

}
