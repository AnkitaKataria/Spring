package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldConstructor {

	public static void main(String args[]) {
		// Load xml in container
		// This loads on start, object will be created when xml is loaded
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring_Constructor.xml");
		TestConstructor t = (TestConstructor) ap.getBean("t");
		// Create test class object, IOC container creates the object even if Test class 
		//constructor is private. In Class class, there is a method setAccessible which
		//is set to true. This is set by container
		t.hello();
	}
}
