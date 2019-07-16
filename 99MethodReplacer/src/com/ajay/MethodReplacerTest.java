package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplacerTest {
	
	public static void main(String args[]) {
		String files[]=new String[] {"resources/Test.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Bank b = (Bank) ap.getBean("b");
		b.calInterest();//It will call NewInterestcal reimplemented method
	}
}
