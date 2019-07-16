package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDataAnnotation {

	public static void main(String args[]) {
		String files[]=new String[] {"resources/CarAnnotation.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		CarBeanWithAnnotation c = (CarBeanWithAnnotation) ap.getBean("c");
		c.carData();
	}
}
