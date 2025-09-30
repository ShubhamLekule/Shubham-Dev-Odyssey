package com.studyeasy.creatingdirectory;

import java.io.File;

public class App {

	public static void main(String[] args) {
		File dir=new File("demo/demo");
		// below method only create one dir
		//dir.mkdir()
		//below create sub directory also
		dir.mkdirs();
		System.out.println("Directory created");
	}

}
