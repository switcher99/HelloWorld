package com.opensource.jmeter;

import java.util.Scanner;

public class jmeter {
	private String name;
	private String friend;
	
	public String getName() {
		return name;
	}
	
	public void setName() {

		this.name="Zhang";
	}
	
	public String getFriend() {
		return friend;
	}
	
	public void setFriend() {
		
		this.friend="Lee";
	}
	
	public void Print() {
		System.out.print(name);
	}
	
}
