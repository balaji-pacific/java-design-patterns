/**
 * 
 */
package com.java.design.patterns.creational.factory_1;

/**
 * @author balajisoundarrajan
 *
 */
public class ComputeConfiguration {
	
	public static Computer getComputer(String type, String cpu, String ram, String hdd) {
		if("Server".equalsIgnoreCase(type)) {
			return new ServerComputer( cpu, ram, hdd);
		}else if("Personal".equalsIgnoreCase(type)){
			return new PersonalComputer( cpu, ram, hdd);
		}
		return null;
	}

}
