/**
 * 
 */
package com.java.design.patterns.creational.builder;

/**
 * @author balajisoundarrajan
 *
 */
public class BuilderFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Balaji","Soundarrajan")
				.age(37)
				.phoneNumber("+1-573-644-3538")
				.address("9558 Creighton Rd NW, Concord, NC - 28027")
				.build();
		
		System.out.println(user);

	}

}
