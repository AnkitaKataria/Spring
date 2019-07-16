package com.ajay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //This define Car class as bean.SO we dont need to do entry for Car in xml
public class Car {

	@Autowired
	@Qualifier(value="e")
	private Engine engine;
	
	public void carData() {
		System.out.println(engine.getModelyear());
	}
}
