package com.udemy.equalsandhashcode;

import java.util.Map;
import java.util.Objects;
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
	@Override
	public int hashCode() {
		return Objects.hash(lectNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectNo, other.lectNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
	
}
public class App {

	public static void main(String[] args) {
		String str1="Shubham";
		String str2="Shubham";
		System.out.println(str1==str2);
		
		String str3=new String("Shubham");
		String str4=new String("Shubham");
		System.out.println(str3==str4);
		System.out.println("hascode str3 : "+str3.hashCode()+" , hascode str4 : "+str4.hashCode());
		System.out.println(str3.equals(str4));
		
		Code code1=new Code("L01","S03");
		Code code2=new Code("L01","S03");
		// Before implementing hashcode and equals in code class result of below is false
		//hashcode of below before implementation is diff:
		//hascode code1 : 93122545 , hascode code2 : 2083562754
		System.out.println(code1.equals(code2));
		System.out.println("hascode code1 : "+code1.hashCode()+" , hascode code2 : "+code2.hashCode());
		//After implementing equals and hashcode above value is true
		//hascode code1 : 2595896 , hascode code2 : 2595896
		System.out.println(code1==code2);
		
		
		
		//After implementing hashcode and equals duplicate key will not generate for below
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
