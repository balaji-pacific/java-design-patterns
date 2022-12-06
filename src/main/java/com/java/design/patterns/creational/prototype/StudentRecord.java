/**
 * 
 */
package com.java.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balajisoundarrajan
 *
 */
public class StudentRecord implements Cloneable{

	/**
	 * 
	 */
	public StudentRecord() {
		
	}
	
	private String name;
	private int age;
	private String address;
	private List<String> friends = new ArrayList<String>();
	
	public void loadData() {
		this.name = "Balaji";
		this.age = 37;
		this.address = "9558 Creighton Road NW, Concord, CC - 28027";
		this.friends.add("Ashok");
		this.friends.add("Rajesh");
	}
	
	public void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
		System.out.println("Friends : ");
		friends.forEach(s->System.out.println(s));
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the friends
	 */
	public List<String> getFriends() {
		return friends;
	}
	/**
	 * @param friends the friends to set
	 */
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	
	@Override
	public Object clone() {
		
		StudentRecord record = new StudentRecord();
		record.setName(this.name);
		record.setAge(this.age);
		record.setAddress(this.address);
		record.setFriends(new ArrayList<String>(this.friends));
		
		return record;
		
	}
	
}
