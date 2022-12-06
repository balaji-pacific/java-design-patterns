/**
 * 
 */
package com.java.design.patterns.creational.builder;

/**
 * @author balajisoundarrajan
 *
 */
public class User {
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phoneNumber;
	private final String address;
	
	public User(UserBuilder userBulider) {
		this.firstName = userBulider.firstName;
		this.lastName = userBulider.lastName;
		this.age = userBulider.age;
		this.phoneNumber = userBulider.phoneNumber;
		this.address = userBulider.address;
	}
	
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}



	public static class UserBuilder {
		
		private final String firstName;
		private final String lastName;
		private int age;
		private String phoneNumber;
		private String address;
		
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}

}


