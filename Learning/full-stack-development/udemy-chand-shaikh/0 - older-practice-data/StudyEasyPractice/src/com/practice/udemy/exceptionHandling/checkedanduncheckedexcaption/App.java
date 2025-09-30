package com.practice.udemy.exceptionHandling.checkedanduncheckedexcaption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		// Below Arithmetic exception is unchecked exception as compiler allowing to compile this code 
		// without handling it.
		int x=10/0;
		System.out.println(x);
		// If we keep handling each and every minor exception then java became slow thats why there are some 
		// exception which handled by java 
		
		// Unchecked Exception: less serious Exception which programmer may or may not handled as per there need.
		// Checked Exception  : Most serious Exception which programmer need to handled right away.
		
		// Below is the checked Exception example
		try {
			FileReader fr=new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
