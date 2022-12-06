/**
 * 
 */
package com.java.design.patterns.creational.factory_2;

/**
 * @author balajisoundarrajan
 *
 */
public class EmailNotification implements Notification{
	
	@Override
	public void sendNotification() {
		
		
		try {
			System.out.println("Getting Email");
			Thread.sleep(100);
			System.out.println("Sending Email....");
			Thread.sleep(2000);
			System.out.println("Email Sent");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
