/**
 * 
 */
package com.java.design.patterns.creational.singleton;

/**
 * @author balajisoundarrajan
 *
 */
public class Singleton {
	
	public static Singleton singletonInstance = null;
	
	private int value = 0;
	
	
	public static synchronized Singleton getInstance() {
		if(singletonInstance == null) {
			return singletonInstance = new Singleton();
		}else {
			return singletonInstance;
		}
	}
	

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
}
