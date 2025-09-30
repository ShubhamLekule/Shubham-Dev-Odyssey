package com.udemy.generics.boundedtypeparameter;

class Data<K extends Integer, V extends App>{
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
	
	public <E extends Character,N extends Number> void display(E element, N num){
		System.out.println("Element : "+element+" Number : "+num);
	}
}


public class App {

	public static void main(String[] args) {
		Data<Integer, App> data=new Data<>(1,new App());
		data.getValue().test();;
		System.out.println(data.getKey());
		data.display('$', 26);
		

	}
	public void test() {
		System.out.println("Testing ....");
	}

}
