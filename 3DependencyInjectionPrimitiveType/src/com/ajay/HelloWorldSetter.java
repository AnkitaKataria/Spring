package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSetter {

	public static void main(String args[]) {
		// Load xml in container
		// This loads on start, object will be created when xml is loaded
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring.xml");
		Test t = (Test) ap.getBean("t");
		t.hello("Ajay");
	}
}
