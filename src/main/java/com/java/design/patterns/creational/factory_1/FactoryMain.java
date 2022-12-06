/**
 * 
 */
package com.java.design.patterns.creational.factory_1;

/**
 * @author balajisoundarrajan
 *
 */
public class FactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Computer personal = ComputeConfiguration.getComputer("Personal", "500 GHz", "16 GB", "500 GB");
		Computer server = ComputeConfiguration.getComputer("Server", "2048 GHz", "1 TB", "500 TB");
		
		System.out.println("Personal " + personal.toString());
		System.out.println("Server " + server.toString());
	}

}
