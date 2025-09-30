package com.udemy.autoboxingandunboxing;

import java.util.ArrayList;

class intValues{
	private int inVal;

	public int getInVal() {
		return inVal;
	}

	public void setInVal(int inVal) {
		this.inVal = inVal;
	}

	public intValues(int inVal) {
		this.inVal = inVal;
	}
	
}

public class App {

	public static void main(String[] args) {
		//below will not work as collection will not work with primitive data type
		//ArrayList<int> studNum=new ArrayList<>();
		ArrayList<Integer> studNum=new ArrayList<>();
		studNum.add(8);//autoboxing: java will take care automatic conversion of int to Integer 
		studNum.add(1);
		studNum.add(4);
		studNum.add(6);
		//In background java will convert above code like below
		studNum.add(Integer.valueOf(6));
		System.out.println(studNum.get(0));
		//In background java will convert above code like below
		System.out.println(studNum.get(0).intValue());
		System.out.println("***********************************");
		for(int x:studNum) {//unboxing
			System.out.println(x);
		}
		System.out.println("***********************************");
		ArrayList<intValues> studNo=new ArrayList<>();
		studNo.add(new intValues(10));//manual boxing
		System.out.println(studNo.get(0).getInVal());//unboxing
	}

}
