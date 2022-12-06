/**
 * 
 */
package com.java.design.patterns.creational.factory_1;

/**
 * @author balajisoundarrajan
 *
 */
public abstract class Computer {
	
	public abstract String getCPU();
	public abstract String getRAM();
	public abstract String getHDD();
	@Override
	public String toString() {
		return "Computer - CPU = " + getCPU() + ", RAM = " + getRAM() + ", HDD = " + getHDD() ;
	}
}
