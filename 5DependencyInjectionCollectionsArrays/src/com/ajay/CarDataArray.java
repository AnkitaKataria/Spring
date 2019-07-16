package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDataArray {
	public static void main(String args[]) {		
		//String files[]=new String[] {"resources/Car.xml","resources/Engine.xml"};
		String files[]=new String[] {"resources/Car.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ap.getBean("c");
		c.printdata();
	}
}
