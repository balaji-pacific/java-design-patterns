/**
 * 
 */
package com.java.design.patterns.structural.adaptor;

/**
 * @author balajisoundarrajan
 *
 */
public interface Turkey {
	
	public void gobble();
	public void fly();

}

class WildTurkey implements Turkey{
	@Override
	public void gobble() {
		System.out.println("Turkey Says Gobble... Gobble");
	}

	@Override
	public void fly() {
		System.out.println("Can Fly Short distance");
	}
}


