package com.udemy.searchundermap;

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
		Map<Code, String> session=new TreeMap<Code,String>();
		session.put(new Code("S01","L03"), "Generics");
		session.put(new Code("S01","L01"), "Files Under Java");
		session.put(new Code("S02","L03"), "Ntework Programming");
		session.put(new Code("S01","L07"), "OOPS");
		session.put(new Code("S01","L05"), "Methods");
		session.put(new Code("S01","L03"), "Expressions");
		// to search by value
		Code code=null;
		
		for(Map.Entry<Code, String> entry: session.entrySet()) {
			if(entry.getValue().equals("OOPS"))
				System.out.println("entry.getKey() :"+entry.getKey());
			//It will assign key as code
				code = entry.getKey();
		}
		System.out.println(code);
	}

}
