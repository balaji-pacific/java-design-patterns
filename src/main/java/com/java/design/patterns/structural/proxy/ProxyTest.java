/**
 * 
 */
package com.java.design.patterns.structural.proxy;

/**
 * @author balajisoundarrajan
 *
 */
public class ProxyTest {

	/**
	 * 
	 */
	public ProxyTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		Internet proxyInternet = new ProxyInternet();
		
		proxyInternet.connect("www.google.com"); 
		proxyInternet.connect("www.gmail.com");
		
		
		

	}

}
