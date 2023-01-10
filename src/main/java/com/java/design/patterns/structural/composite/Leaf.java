/**
 * 
 */
package com.java.design.patterns.structural.composite;

/**
 * @author balajisoundarrajan
 *
 */
public class Leaf implements Component {
	
	int price;
	String name;
	
	

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		
		System.out.println("Name : " + name + " Price : " + price);
		
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
