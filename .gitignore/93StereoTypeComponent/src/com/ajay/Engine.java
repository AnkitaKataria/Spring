package com.ajay;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String modelyear;

	public String getModelyear() {
		return modelyear;
	}

	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	

}
