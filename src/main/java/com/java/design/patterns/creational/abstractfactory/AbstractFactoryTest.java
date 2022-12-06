package com.java.design.patterns.creational.abstractfactory;

/**
 * 
 */

/**
 * @author balajisoundarrajan
 *
 */
public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape".toUpperCase());
		Shape shape = shapeFactory.drawShape("Rectangle".toUpperCase());
		shape.drawShape();
		
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color".toUpperCase());
		Color color = colorFactory.fillColor("Red".toUpperCase());
		color.fillColor();

	}

}
