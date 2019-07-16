package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDataByName {

	public static void main(String args[]) {
		String files[]=new String[] {"resources/CarByName.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ap.getBean("c");
		c.carData();
	}
}
