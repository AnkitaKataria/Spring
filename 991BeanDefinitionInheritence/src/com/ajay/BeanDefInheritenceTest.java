package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefInheritenceTest {
	
	public static void main(String args[]) {
		String files[]=new String[] {"resources/Test.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ap.getBean("c3");
		c.carData();		
	}
}
