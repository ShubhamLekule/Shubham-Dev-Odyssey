package com.studyeasy.serializationofobject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike=new Vehicle("Bike", 8888);
		Vehicle car=new Vehicle("Car", 1111);
		try (FileOutputStream fos=new FileOutputStream("studyeasy/vehicle.dat")){
			try(ObjectOutputStream obj=new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object Written into file");
			}
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException in catch block");
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println("IOException in catch block");
			e1.printStackTrace();
		}

	}

}
