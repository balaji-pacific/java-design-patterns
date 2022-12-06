/**
 * 
 */
package com.java.design.patterns.structural.bridge;

/**
 * @author balajisoundarrajan
 *
 */
public class FourKVideo implements VideoProcessor{

	/**
	 * 
	 */
	public FourKVideo() {
		// TODO Auto-generated constructor stub
	}

	public void process(String playVideo) {
		System.out.println("Playing 4K Video " + playVideo);
	}

}
