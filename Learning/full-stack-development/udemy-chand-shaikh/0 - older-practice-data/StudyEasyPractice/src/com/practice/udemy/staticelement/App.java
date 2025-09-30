package com.practice.udemy.staticelement;

import com.practice.udemy.staticelement.testrun.TestStatic;

public class App {

	public static void main(String[] args) {
		TestStatic test=new TestStatic();
		TestStatic test1=new TestStatic();
		
		
		// normal(non-static) variable shares different memory allocation. in below case both test and test1 object share 
		//Different memory allocation for variable normalVariable because of that after updating value 20 in test 
		//object its changing to zero for test1 object 
		
		System.out.println("Normal Variable for test before update :"+test.getNormalVariable());
		test.setNormalVariable(20);
		System.out.println("Normal Variable for test After update :"+test.getNormalVariable());
		
		System.out.println("Normal Variable for test1 before update :"+test1.getNormalVariable());
		test1.setNormalVariable(20);
		System.out.println("Normal Variable for test1 After update :"+test.getNormalVariable());
		
		System.out.println("*******************************************************************");
		
		// Static variable shares single memory allocation. in below case both test and test1 object share 
		//same memory allocation for variable staticVariable because of that after updating value 20 in test 
		//object its not changing for test1 object 
		
		System.out.println("Static Variable for test before update :"+test.getStaticVariable());
		test.setStaticVariable(20);
		System.out.println("Static Variable for test After update :"+test.getStaticVariable());
		
		System.out.println("Static Variable for test before update :"+test1.getStaticVariable());
		test1.setStaticVariable(20);
		System.out.println("Static Variable for test After update :"+test1.getStaticVariable());
		
		// above we use object to access static variable but its not advisable or its not a good practice 
		// static variable to can directly call by mentioning class name
		System.out.println("*******************************************************************");
		System.out.println("Static Variable : "+TestStatic.getStaticVariable());
		
	}

}
