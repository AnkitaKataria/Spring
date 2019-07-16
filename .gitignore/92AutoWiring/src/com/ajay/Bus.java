package com.ajay;

public class Bus {

	private String carname;
	private Engine engine;
	
	public Bus(Engine engine) {
		this.engine=engine;
	}
	
	public void carData() {
		System.out.println(getCarname()+".."+engine.getModelyear());
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
}
