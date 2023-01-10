/**
 * 
 */
package com.java.design.patterns.structural.composite;

/**
 * @author balajisoundarrajan
 *
 */
public class CompositeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Component ram = new Leaf(3000, "RAM");
		Component processor = new Leaf(8000, "Processor");
		
		Component mouse = new Leaf(500, "Mouse");
		Component keyboard = new Leaf(1000, "Keyboard");
		Component monitor = new Leaf(7000, "Monitor");
		
		
		Composite cabinet = new Composite("Cabinet");
		cabinet.addComponent(ram);
		cabinet.addComponent(processor);
		
		Composite computer = new Composite("Computer");
		computer.addComponent(mouse);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(cabinet);
		
		
		computer.showPrice();
		
	}

}
