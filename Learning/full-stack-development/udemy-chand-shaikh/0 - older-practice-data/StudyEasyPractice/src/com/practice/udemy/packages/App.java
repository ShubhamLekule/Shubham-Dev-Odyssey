package com.practice.udemy.packages;

import javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Packages is nothing but folder structure in java project
		// to create sub folder we use dot(.) symbol in package 
		// base folder in java is always src
		// Inside src mentioned package folder structure will get created
		
		//why we use packages? -> for better organization of code and to reduce naming conflicts
		
		
		// There are 3 ListDataHandler from different package given below
		// Because of package system we can create class with same name but different functionality by puttting
		//this class in different packages
		// Below ListDataHandler is from javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler; package
		ListDataHandler ldh;
		
		// Below ListDataHandler from javax.swing.plaf.basic.BasicComboPopup package
		javax.swing.plaf.basic.BasicComboPopup.ListDataHandler ldh1;
		
		//Below ListDataHandler from ListDataHandler
		javax.swing.plaf.basic.BasicListUI.ListDataHandler ldh2;
	}

}
