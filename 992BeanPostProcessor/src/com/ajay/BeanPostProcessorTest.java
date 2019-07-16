package com.ajay;

import org.springframework.context.ApplicationContext	;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTest {
	
	public static void main(String args[]) {
		String files[]=new String[] {"resources/Test.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ap.getBean("c1");
		c.carData();		
	}
}
/*
The differences about BeanFactoryPostProcessor and BeanPostProcessor:

1. A bean implementing BeanFactoryPostProcessor is called when all bean definitions will have 
been loaded, but no beans will have been instantiated yet. This allows for overriding or adding
 properties even to eager-initializing beans. This will let you have access to all the beans 
 that you have defined in XML or that are annotated (scanned via component-scan).
 
2. A bean implementing BeanPostProcessor operate on bean (or object) instances which means that 
when the Spring IoC container instantiates a bean instance then BeanPostProcessor interfaces do
their work.
 
3. BeanFactoryPostProcessor implementations are "called" during startup of the Spring context 
after all bean definitions will have been loaded while BeanPostProcessor are "called" when the 
Spring IoC container instantiates a bean (i.e. during the startup for all the singleton and on 
demand for the prototypes one).
*/