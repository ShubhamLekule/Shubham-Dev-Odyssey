package com.udemy.generics.partThree;

class Data<K,V>{
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public <E,N> void display(E element, N num){
		System.out.println("Element : "+element);
		System.out.println("Number : "+num);
	}
}

public class App {

	public static void main(String[] args) {
		Data<Integer, String> data=new Data<Integer, String>(1,"Shubham");
		System.out.println("Key : "+data.getKey());
		System.out.println("Value : "+data.getValue());
		data.display("2.0", 26);
	}

}
