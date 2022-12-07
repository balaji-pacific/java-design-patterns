/**
 * 
 */
package com.java.design.patterns.structural.facade;

/**
 * @author balajisoundarrajan
 *
 */
public class CheckHardward {
	
	private MotherBoard motherBoard;
	private RAM ram;

	/**
	 * 
	 */
	public CheckHardward() {
		super();
		this.motherBoard = new MotherBoard();
		this.ram = new RAM();
	}
	
	public boolean checkHardwardConfiguration() {
		if(motherBoard.checkMotherBoard() && ram.checkRAM()) {
			return true;
		}else {
			return false;
		}
	}

}
