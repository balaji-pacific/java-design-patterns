/**
 * 
 */
package com.java.design.patterns.creational.singleton;

/**
 * @author balajisoundarrajan
 *
 */
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		
		singleton.setValue(55);
		
		System.out.println("First Reference " + singleton);
		System.out.println("Value of value: " + singleton.getValue());
		
		singleton = null;
		
		System.out.println("After making null : " + singleton);
		
		singleton = Singleton.getInstance();
		
		System.out.println("Second Reference " + singleton);
		System.out.println("Value of value: " + singleton.getValue());
		
	}

}
