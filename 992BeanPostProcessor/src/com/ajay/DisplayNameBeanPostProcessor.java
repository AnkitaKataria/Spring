package com.ajay;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
//Spring executes some code after initializing bean. We can modify this actions by implementing 
//BeanPostProcessor. Its main purpose is to extend the functionality of framework and and we 
//can provide our own configuration.
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After Initialization:"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In before Initialization:"+beanName);
		return bean;
	}

}
