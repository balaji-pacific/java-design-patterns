/**
 * 
 */
package com.java.design.patterns.structural.facade;

/**
 * @author balajisoundarrajan
 *
 */
public class CheckSoftware {
	
	private OperatingSystem operatingSystem;
	private Driver driver;


	public CheckSoftware() {
		super();
		this.operatingSystem = new OperatingSystem();
		this.driver = new Driver();
	}
	
	public boolean checkSoftwareConfiguration() {
		if(operatingSystem.checkOperatingSystem() && driver.checkDriver()) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
