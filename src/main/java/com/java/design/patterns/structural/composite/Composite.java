/**
 * 
 */
package com.java.design.patterns.structural.composite;

import java.util.ArrayList;

/**
 * @author balajisoundarrajan
 *
 */
public class Composite implements Component{
	
	String name;
	
	ArrayList<Component> arrayList = new ArrayList<Component>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	public void addComponent(Component c) {
		arrayList.add(c);
	}

	@Override
	public void showPrice() {
		arrayList.forEach(s -> s.showPrice());
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

}
