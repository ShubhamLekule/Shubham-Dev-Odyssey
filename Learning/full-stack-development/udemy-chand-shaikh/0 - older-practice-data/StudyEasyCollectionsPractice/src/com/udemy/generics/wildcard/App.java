package com.udemy.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleId;

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
	void Info() {
		System.out.println("Vehicle Id is "+getVehicleId());
	}
}

class Car extends Vehicle{
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]" + "Vehicle [vehicleId="+super.getVehicleId()+"]";
	}
	@Override
	void Info() {
		System.out.println("Car Model is "+getCarModel());
	}
}

public class App {
public static void main(String[] args) {
	List<Object> list=new ArrayList<>();
	list.add(new Vehicle(10));
	list.add(new Vehicle(20));
	list.add(new Vehicle(30));
	list.add(new Vehicle(40));
	list.add(new Car(50,"BMW"));
	list.add("Shubham");
	display(list);
	System.out.println("*****************************");
	List<Vehicle> list2=new ArrayList<>();
	list2.add(new Vehicle(10));
	list2.add(new Vehicle(20));
	list2.add(new Vehicle(30));
	list2.add(new Vehicle(40));
	list2.add(new Car(50,"BMW"));
	displayUpperBound(list2);
	System.out.println("*****************************");
	List<Vehicle> list3=new ArrayList<>();
	list3.add(new Vehicle(10));
	list3.add(new Vehicle(20));
	list3.add(new Vehicle(30));
	list3.add(new Vehicle(40));
	list3.add(new Car(50,"BMW"));
	displayLowerBound(list3);
	
}
// As we dont know which class will be there is list so we use wildcars("?")
public static void display(List<?> list) {
	for(Object elm:list) {
		System.out.println(elm);
	}
}
//List<? extends Vehicle> this means list contain either Vehicle class or any child class 
//of Vehicle i.e Vehicle and Car class in this scenario
public static void displayUpperBound(List<? extends Vehicle> list) {
	for(Vehicle elm:list) {
		//System.out.println(elm);
		elm.Info();
	}
}
//List<? super Car> this means list contain either Car Class or any parent class of Car i.e
//Car, Vehicle and Object class in this scenario
public static void displayLowerBound(List<? super Car> list) {
	for(Object elm:list) {
		System.out.println(elm);
		//With Lowerbound approach we cannot call override method 
		//elm.Info()  --> this will not work, this will only work with upper bound approach
	}
}
}
