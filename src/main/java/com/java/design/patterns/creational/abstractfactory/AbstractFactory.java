/**
 * 
 */
package com.java.design.patterns.creational.abstractfactory;

/**
 * @author balajisoundarrajan
 *
 */
public abstract class AbstractFactory {
	
	public abstract Shape drawShape(String shape);
	public abstract Color fillColor(String color);

}
