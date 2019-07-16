package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesCollectionTest {
	public static void main(String args[]) {
		//To fetch data from xml
		//String files[]=new String[] {"resources/Test.xml"};
		
		//To fetch data from properties file
		String files[]=new String[] {"resources/TestUsingPropertiesFile.xml"}; 
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Test c = (Test) ap.getBean("c");
		c.printData();
		
		//It is used to read data from property file using resource Bundle
		System.out.println(ap.getMessage("url", null, "Not Found",null));
	}
}
