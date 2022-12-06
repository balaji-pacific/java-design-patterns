/**
 * 
 */
package com.java.design.patterns.structural.adaptor;

/**
 * @author balajisoundarrajan
 *
 */
public class TurkeyAdaptor implements Duck{
	Turkey turkey;

	/**
	 * 
	 */
	public TurkeyAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=1; i<=5; i++){
			turkey.fly();
		}
	}
}
