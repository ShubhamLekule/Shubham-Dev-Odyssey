package com.studyeasy.filedeletion;

import java.io.File;

public class App {

	public static void main(String[] args) {
		File file=new File("src/demo1.txt");
		if(file.delete())
			System.out.println("File Deleted");
		else
			System.err.println("file not prsent");

	}

}
