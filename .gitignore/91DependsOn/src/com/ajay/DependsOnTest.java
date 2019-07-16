package com.ajay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnTest {
	public static void main(String args[]) {
		new ClassPathXmlApplicationContext("resources/Test.xml");
	}
}
