/**
 * 
 */
package com.java.design.patterns.creational.factory_1;

/**
 * @author balajisoundarrajan
 *
 */
public class PersonalComputer extends Computer {
	
	public String ram;
	public String cpu;
	public String hdd;
	
	public PersonalComputer(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

}