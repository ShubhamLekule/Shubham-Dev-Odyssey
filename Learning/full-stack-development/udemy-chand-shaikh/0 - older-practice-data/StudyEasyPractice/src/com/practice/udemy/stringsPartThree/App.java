package com.practice.udemy.stringsPartThree;

public class App {

	public static void main(String[] args) {
		
		String str="Confidence and Hard-work is the best medicine to kill the disease called failure. "
				+ "It will make you a successful person - Abdul Kalam";
		String str1="sHuBhAm";
		String str2="shubham";
		char[] charater= {'H','d','r','a'};
		String str4=String.format("name is %s",str2);
		
		System.out.println("CharAt : "+str.charAt(15));
		System.out.println("codePointAt : "+str.codePointAt(15));
		System.out.println("codePointAt : "+str.codePointAt(14));
		System.out.println("codePointBefore : "+str.codePointBefore(15));
		System.out.println("codePointCount : "+str.codePointCount(14,15));
		System.out.println("compareTo, Compares two strings lexicographically : "+str1.compareTo(str2));
		System.out.println("compareToIgnoreCase : "+str1.compareToIgnoreCase(str2));
		System.out.println("concat : "+str1.concat(str2));
		System.out.println("contains : "+str.contains("Hard"));
		System.out.println("contentEquals : "+str.contentEquals("Hard"));
		System.out.println("contentEquals : "+str1.contentEquals("sHuBhAm"));
		System.out.println("contentEquals : "+str2.contentEquals("sHuBhAm"));
		//System.out.println("copyValueOf : "+str.copyValueOf(charater));
		System.out.println("endsWith : "+str.endsWith("Hard"));
		System.out.println("endsWith : "+str.endsWith("Kalam"));
		System.out.println("endsWith : "+str1.equals("sHuBhAm"));
		System.out.println("endsWith : "+str1.equalsIgnoreCase("shubham"));
		System.out.println("Format :"+String.format("name is %s",str2));
		System.out.println("Format :"+String.format("name is %s",str2));
		System.out.println("Format :"+String.format("name is %f",32.33434));
		System.out.println("Format :"+String.format("name is %32.12f",32.33434));// returns 12 char fractional part filling with 0
		System.out.println("Get byte :"+str.getBytes());
		System.out.println("hashCode :"+str.hashCode());
		System.out.println("indexOf :"+str.indexOf("Hard"));
		System.out.println("intern :"+str.intern());
		System.out.println("isEmpty :"+str.isEmpty());
		System.out.println("lastIndexOf :"+str.lastIndexOf("Hard"));
		System.out.println("length :"+str.length());
	}

}
