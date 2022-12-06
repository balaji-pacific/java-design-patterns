/**
 * 
 */
package com.java.design.patterns.creational.factory_2;

/**
 * @author balajisoundarrajan
 *
 */
public class PushNotification implements Notification{
	
	@Override
	public void sendNotification() {
		
		
		try {
			Thread.sleep(100);
			System.out.println("Sending Notification....");
			Thread.sleep(2000);
			System.out.println("Notification Sent");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
