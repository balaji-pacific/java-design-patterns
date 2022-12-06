/**
 * 
 */
package com.java.design.patterns.creational.abstractfactory;

/**
 * @author balajisoundarrajan
 *
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Shape drawShape(String shape) {
		return null;
	}

	@Override
	public Color fillColor(String color) {
		
		switch (color) {
			case "RED":
				return new Red();
			case "YELLOW":
				return new Yellow();
			case "WHITE":
				return new White();
			default:
				throw new IllegalArgumentException();
		}
	}

}
