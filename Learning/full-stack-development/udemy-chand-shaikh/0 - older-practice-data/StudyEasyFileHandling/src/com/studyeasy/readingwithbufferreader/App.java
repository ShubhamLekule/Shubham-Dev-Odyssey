package com.studyeasy.readingwithbufferreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("studyeasy/team.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found exception");
		} catch (IOException e) {
			System.err.println("IO Exception");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
