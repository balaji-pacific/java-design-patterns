/**
 * 
 */
package com.java.design.patterns.structural.proxy;

/**
 * @author balajisoundarrajan
 *
 */
public class InternalInternet implements Internet{

	@Override
	public void connect(String siteName) {
		
		System.out.println("Connecting to the site " + siteName);
	}

}
