package com.ajay;

public class TestConstructor {

	private String name;
	private String email;
	private int age;
	
	public TestConstructor(String name, int age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}
	public void hello() {
		System.out.println("hello "+name+".."+age+".."+email);
	}
}
