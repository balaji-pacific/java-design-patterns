/**
 * 
 */
package com.java.design.patterns.structural.adaptor;

/**
 * @author balajisoundarrajan
 *
 */
public interface Duck {
	
	public void quack();
	public void fly();

}

class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Duck Says Quack... Quack...");
		
	}

	@Override
	public void fly() {
		System.out.println("Duck can fly...");
	}
}
