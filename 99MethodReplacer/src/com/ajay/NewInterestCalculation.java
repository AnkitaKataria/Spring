package com.ajay;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewInterestCalculation implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("In reimplement");
		return arg0;
	}
}
