package com.ajay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldLazy {

	public static void main(String args[]) {
		//Find xml
		Resource r = new ClassPathResource("resources/Spring.xml");
		
		//Load xml in container
		BeanFactory factory = new XmlBeanFactory(r); //This loads on demand, object will be created when first user want to create object
		
		/*If you try to create multiple objects using same Id, it will not create as it create only 
		 * one object as default scope is --scope="singleton"--. This is handled from Spring.xml
		 * If you want to create multiple objects, set scope="prototype"
		 */
		Test t=(Test) factory.getBean("t");//Create test class object
		Test t1=(Test) factory.getBean("t");
		System.out.println(t==t1);//true if scope="singleton"
		t.hello();
	}
}
