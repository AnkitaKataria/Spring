package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDataStaticVariable {

	public static void main(String args[]) {
		String files[]=new String[] {"resources/Car.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);////It will return new obj
		//Car c = (Car) ap.getBean(Car.class);
		Car.getInstance();//It will return old obj
		
	}
}
