package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDataFactoryMain {

	public static void main(String args[]) {
		String files[]=new String[] {"resources/Car.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ap.getBean(Car.class);
		c.drive();
		
	}
}
