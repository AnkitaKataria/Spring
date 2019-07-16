package com.ajay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car {

	private static Car c;
	private Car() {
		
	}
	
	public static Car getInstance() {
		if(c==null) {
			c=new Car();
			System.out.println("New obj");
			return c;			
		}else {
			System.out.println("Old obj");
			return c;
		}
	}
	
	//To prevent object cloning
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
