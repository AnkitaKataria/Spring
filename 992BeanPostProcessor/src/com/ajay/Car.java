package com.ajay;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car{
	private Engine engine1;
	private Engine engine2;
	private Engine engine3;
	
	public Engine getEngine1() {
		return engine1;
	}
	public void setEngine1(Engine engine1) {
		this.engine1 = engine1;
	}
	public Engine getEngine2() {
		return engine2;
	}
	public void setEngine2(Engine engine2) {
		this.engine2 = engine2;
	}
	public Engine getEngine3() {
		return engine3;
	}
	public void setEngine3(Engine engine3) {
		this.engine3 = engine3;
	}
	
	public void carData() {
		System.out.println(engine1.getModelyear()+".."+engine2.getModelyear()+"..."+engine3.getModelyear());
	}
	
}
