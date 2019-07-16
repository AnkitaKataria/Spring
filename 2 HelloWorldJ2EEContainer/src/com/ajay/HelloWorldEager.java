package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldEager {

	public static void main(String args[]) {
		// Load xml in container
		// This loads on start, object will be created when xml is loaded but using lazy-init attribute we can create obj when required.
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring.xml");
		Test t = (Test) ap.getBean("t");
		System.out.println(t.hashCode());//1006485584
		Test t1 = (Test) ap.getBean("t1");
		System.out.println(t1.hashCode());//466505482
		Test t2 = (Test) ap.getBean("t1");
		System.out.println(t2.hashCode());//466505482
		// Create test class object, IOC container creates the object even if Test class 
		//constructor is private. In Class class, there is a method setAccessible which
		//is set to true. This is set by container
		t.hello();
	}
}
