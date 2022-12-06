/**
 * 
 */
package com.java.design.patterns.creational.abstractfactory;

/**
 * @author balajisoundarrajan
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		}else if("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}else {
			throw new IllegalArgumentException();
		}
	}

}
