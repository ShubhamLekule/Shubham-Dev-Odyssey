package com.studyeasy.serializationofobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("studyeasy/vehicle.dat")){
			try(ObjectInputStream obj=new ObjectInputStream(fis)){
				Vehicle v1=(Vehicle) obj.readObject();
				Vehicle v2=(Vehicle) obj.readObject();
				System.out.println("Object 1:"+v1);
				System.out.println("Object 2:"+v2);
				
			} catch (ClassNotFoundException e) {
				System.err.println("ClassNotFoundException in catch block");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException in catch block");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IOException in catch block");
			e.printStackTrace();
		}

	}

}
