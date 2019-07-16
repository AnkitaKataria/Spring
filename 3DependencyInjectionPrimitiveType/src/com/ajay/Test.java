package com.ajay;

public class Test {

	private String gender;
	
	public void hello(String name) {
		System.out.println("hello"+getGender()+".."+name);
	}
	public String getGender() {
		return gender;
	}
	
	//If we make setter private we will get "Bean property 'gender' is not writable"
	public void setGender(String gender) {
		this.gender = gender;
	}
}
