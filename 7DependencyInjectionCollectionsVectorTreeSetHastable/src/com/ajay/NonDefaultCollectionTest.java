package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NonDefaultCollectionTest {
	public static void main(String args[]) {		
		
		String files[]=new String[] {"resources/Test.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Test c = (Test) ap.getBean("c");
		c.printData();
	}
}
