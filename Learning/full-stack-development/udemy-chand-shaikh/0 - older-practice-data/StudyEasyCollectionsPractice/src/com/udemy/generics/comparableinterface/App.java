package com.udemy.generics.comparableinterface;

class Data<T extends Comparable<T>> implements Comparable<T>{
	private T myVar;

	public Data(T myVar) {
		this.myVar = myVar;
	}

	public T getMyVar() {
		return myVar;
	}

	@Override
	public String toString() {
		return "Data [myVar=" + myVar + "]";
	}

	@Override
	public int compareTo(T o) {
		// to reverse: o.compareTo(getMyVar())
		return getMyVar().compareTo(o);
	}
	
	
}

public class App {

	public static void main(String[] args) {
		Data<Integer> data=new Data<>(1);
		System.out.println(data.compareTo(1));
		System.out.println(data.compareTo(0));
		System.out.println(data.compareTo(2));

	}

}
