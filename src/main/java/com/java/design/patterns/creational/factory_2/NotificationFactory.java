/**
 * 
 */
package com.java.design.patterns.creational.factory_2;

/**
 * @author balajisoundarrajan
 *
 */
public class NotificationFactory {
	
	public static Notification createNotification(String channel) {
		switch(channel) {
		case "SMS" :
				return new SMSNotification();
		case "EMAIL":
				return new EmailNotification();
		case "PUSH":
				return new PushNotification();
		default:
				throw new IllegalArgumentException();
				
		}
	}
}
