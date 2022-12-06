/**
 * 
 */
package com.java.design.patterns.creational.factory_2;

/**
 * @author balajisoundarrajan
 *
 */
public class SendNotification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Notification smsNotification = NotificationFactory.createNotification("SMS");
		smsNotification.sendNotification();
		
		Notification emailNotification = NotificationFactory.createNotification("EMAIL");
		emailNotification.sendNotification();
		
		Notification pushNotification = NotificationFactory.createNotification("PUSH");
		pushNotification.sendNotification();
	}

}
