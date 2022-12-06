/**
 * 
 */
package com.java.design.patterns.creational.factory_2;

/**
 * @author balajisoundarrajan
 *
 */
public class SMSNotification implements Notification{

	@Override
	public void sendNotification() {
		
		
		try {
			System.out.println("Getting Phone Number");
			Thread.sleep(100);
			System.out.println("Sending Message....");
			Thread.sleep(2000);
			System.out.println("Message Sent");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
