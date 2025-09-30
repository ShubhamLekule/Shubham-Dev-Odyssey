package com.udemy.treemap;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectNo;
	
	public Code(String sectionNo, String lectNo) {
		this.sectionNo = sectionNo;
		this.lectNo = lectNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectNo() {
		return lectNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectNo=" + lectNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1=sectionNo.concat(lectNo);
		String code2=o.getSectionNo()+o.getLectNo();
		return code1.compareTo(code2);
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> lectures=new TreeMap<>();
		lectures.put(3, "Generics");
		lectures.put(1, "Files Under Java");
		lectures.put(2, "Ntework Programming");
		lectures.put(7, "OOPS");
		lectures.put(5, "Methods");
		lectures.put(2, "Expressions");
		
		for(Map.Entry<Integer, String> entry : lectures.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("******************************************");
		// In below scenario 1st and last entry having same key still Map will allow in
		// HashMap as new operator creating new ref and adding that ref to the key part
		//Map<Code, String> session=new HashMap<>();
		
		//Multiple key entry resolved using below , for this we implemeneted Comparable to 
		// Code class
		Map<Code, String> session=new TreeMap<Code,String>();
		session.put(new Code("S01","L03"), "Generics");
		session.put(new Code("S01","L01"), "Files Under Java");
		session.put(new Code("S02","L03"), "Ntework Programming");
		session.put(new Code("S01","L07"), "OOPS");
		session.put(new Code("S01","L05"), "Methods");
		session.put(new Code("S01","L03"), "Expressions");
		for(Map.Entry<Code, String> entry : session.entrySet()) {
			System.out.println(entry);
		}
	}

}
