package com.practice.udemy.packages;

import com.practice.udemy.packages.blog.Java;

//When we import both package which share class with same name it will show error as there will be ambiguity
//import com.practice.udemy.packages.platform.Java;

//Below package also have Java class but when we add * compiler skip Java class from the package as the same 
//name Java class already imported from another package i.e com.practice.udemy.packages.blog.Java;
import com.practice.udemy.packages.platform.*;
// * is a wild card which means whatever class present inside package gets included

public class App2 {

	public static void main(String[] args) {
		Java blog =new Java();
		blog.usedFor();
		
		// when we need to use another Java class which present in another package we need to explicitly 
		//mention the package name. when we need to used second Java class we need to give full path of package
		com.practice.udemy.packages.platform.Java platform=new com.practice.udemy.packages.platform.Java();
		platform.usedFor();
	}

}
