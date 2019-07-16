package com.ajay;

public class Car {

	private String carname;
	private Engine engine;
	
	public void carData() {
		System.out.println(getCarname()+".."+engine.getModelyear());
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
