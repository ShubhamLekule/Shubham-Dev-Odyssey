package com.udemy.comparable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class test {
	public String str;
	protected void test1() throws FileNotFoundException{
		
	}
}
// private ->default-> protected -> public: Incremental, we can incemental in inheritance
public class App2 extends test{
	public String str;
	@Override
	protected void test1() throws FileNotFoundException {
		super.str=this.str;
		FileInputStream r=new FileInputStream("txt.txt");
	}
	
}
