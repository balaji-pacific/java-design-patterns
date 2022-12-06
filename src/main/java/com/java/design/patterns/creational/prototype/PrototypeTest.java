/**
 * 
 */
package com.java.design.patterns.creational.prototype;

/**
 * @author balajisoundarrajan
 *
 */
public class PrototypeTest {

	/**
	 * 
	 */
	public PrototypeTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentRecord record = new StudentRecord();
		record.loadData();

		StudentRecord cloneRecord1 = (StudentRecord) record.clone();
		
		record.getFriends().remove(0);
		record.printData();
		System.out.println("Clone Data : ");
		cloneRecord1.printData();
		
	}

}
