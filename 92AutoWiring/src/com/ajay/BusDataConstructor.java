package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusDataConstructor {

	public static void main(String args[]) {
		String files[]=new String[] {"resources/BusConstructor.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Bus c = (Bus) ap.getBean("c");
		c.carData();
	}
}
