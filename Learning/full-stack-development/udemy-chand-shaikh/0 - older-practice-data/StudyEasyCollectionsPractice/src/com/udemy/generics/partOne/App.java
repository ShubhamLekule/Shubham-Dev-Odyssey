package com.udemy.generics.partOne;

class Data{
	private Object obj;

	public Data(Object obj) {

		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
}
// here T is Type
class GenericClass<T>{
	private T data;

	public GenericClass(T data) {

		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		Data data =new Data("some str");
		// Even though it return string we still need to caste to String Obj
		String var=(String)data.getObj();
		System.out.println(var);
		//In above case we are doing type casting. we are casting to string. 
		//Type casting takes some time to cast. to avid that and restrict to type we use generics
		
		// below generic making to string restrict the data to string if we add int it throw error
		System.out.println("***************************************");
		GenericClass<String> genvar=new GenericClass<>("some str");
		String var1=genvar.getData();
		System.out.println(var1);
		
	}

}
