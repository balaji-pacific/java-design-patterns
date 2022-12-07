/**
 * 
 */
package com.java.design.patterns.structural.flyweight;

/**
 * @author balajisoundarrajan
 *
 */
public class FlyWeightTest {

	public static final String[] color = {"RED","WHITE","PINK","BLACK","BLUE", "GREEN"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i=0; i<=20; i++) {
			Circle circle = (Circle) FlyWeightFactory.drawCircle(getRandomColor());
			circle.setRadius(100);
			circle.setX(getRamdomX());
			circle.setY(getRamdomY());
			circle.draw();
		}
		

	}
	
	public static String getRandomColor() {
		return color[(int)(Math.random()*color.length)];
	}
	
	public static int getRamdomX() {
		return (int) (Math.random()*100);
	}
	
	public static int getRamdomY() {
		return (int) (Math.random()*100);
	}

}
