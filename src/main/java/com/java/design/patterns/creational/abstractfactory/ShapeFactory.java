/**
 * 
 */
package com.java.design.patterns.creational.abstractfactory;

/**
 * @author balajisoundarrajan
 *
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape drawShape(String shape) {
		
		switch (shape) {
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		case "CIRCLE":
			return new Circle();
		default:
			throw new IllegalArgumentException();
	}
	}

	@Override
	public Color fillColor(String color) {
		return null;
	}
	

}
