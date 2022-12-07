/**
 * 
 */
package com.java.design.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * @author balajisoundarrajan
 *
 */
public class FlyWeightFactory {
	
	public static final HashMap<String, Circle> hashMap = new HashMap<String, Circle>();

	public static Shape drawCircle(String color) {
		Circle circle = hashMap.get(color);
		
		if(null == circle) {
			circle = new Circle(color);
			hashMap.put(color, circle);
			System.out.println("Creating a circle object int he map with color " + color);
		}
		return circle;
	}

}
