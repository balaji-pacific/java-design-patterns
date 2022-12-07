/**
 * 
 */
package com.java.design.patterns.structural.facade;

/**
 * @author balajisoundarrajan
 *
 */
public class MachineOn {
	
	private CheckHardward checkHardward;
	private CheckSoftware checkSoftware;
	
	
	
	
	public MachineOn() {
		super();
		this.checkHardward = new CheckHardward();
		this.checkSoftware = new CheckSoftware();
	}




	public boolean switchOnMachine() {
		if(checkHardward.checkHardwardConfiguration() && checkSoftware.checkSoftwareConfiguration())  {
			System.out.println("Switching on the machine");
			return true;
		}
		else {
			return false;
		}
	}

}
