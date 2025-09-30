 package com.practice.udemy.arryas;

public class App {

	public static void main(String[] args) {
		int[] intVariables= {5,6};
		
		System.out.println("int variable array :"+intVariables);// print reference/memory location of array
		System.out.println("intVariables[0] :"+intVariables[0]+" and intVariables[1] :"+intVariables[1]);
		
		int[] intArr=new int[2];
		intArr[0]=7;
		intArr[1]=8;
		
		System.out.println("int variable array :"+intArr);// print reference/memory location of array
		System.out.println("intArr[0] :"+intArr[0]+" and intArr[1] :"+intArr[1]);
		
		String[] stringArr= {"Shubham","Pooja","Pikachu","Shuki","Shubham"};
		System.out.println("string Array print by for loop");
		for(int i=0;i<stringArr.length;i++) {
			System.out.println(stringArr[i]);
		}
		
		System.out.println("string array print by for each loop");
		for(String name:stringArr) {
			System.out.println(name);
		}
		
		System.out.println("== on array index :"+stringArr[0]==stringArr[4]);
		
		//below scenario we assign only 0th and 8th index ,
		// the index which not assign marked as zero
		int[] test=new int[10];
		test[0]=1;
		test[8]=8;
		System.out.println("*************************");
		for(int x:test) {
			System.out.println(x);
		}
		
	}

}
