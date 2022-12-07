/**
 * 
 */
package com.java.design.patterns.structural.flyweight;

/**
 * @author balajisoundarrajan
 *
 */
public class Circle implements Shape{
	
	private int radius;
	private String color;
	private int x;
	private int y;
	/**
	 * 
	 */
	public Circle(String color) {
		super();
		this.color = color;
	}
	
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Circle : [Color " + color + " with x " + x + " with y " + y + " radius " + radius + " ]");
	}

}
