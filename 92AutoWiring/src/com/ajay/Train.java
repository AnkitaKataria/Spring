package com.ajay;

public class Train {

	private Engine engine;
	
	//If we comment default constructor then, para constructor will be used to set engine ref value instead of setter.
	public Train() {
		System.out.println("Default constructor");
	}
	public Train(Engine engine) {
		System.out.println("Para constructor");
		this.engine=engine;
	}
	
	public void carData() {
		System.out.println(engine.getModelyear());
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
