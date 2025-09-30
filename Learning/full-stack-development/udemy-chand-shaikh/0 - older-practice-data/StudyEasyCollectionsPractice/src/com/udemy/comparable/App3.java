package com.udemy.comparable;

class UserDefineException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserDefineException(String str) {
		super(str);
	}
	
}

public class App3 {

	public static void main(String[] args) throws UserDefineException {
		throw new UserDefineException("Resource Not Found");

	}

}
