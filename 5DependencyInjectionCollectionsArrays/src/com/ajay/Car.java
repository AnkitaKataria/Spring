package com.ajay;

public class Car {

	private String[] carname;
	private Engine[] engine;
	
	public String[] getCarname() {
		return carname;
	}
	public void setCarname(String[] carname) {
		this.carname = carname;
	}
	public Engine[] getEngine() {
		return engine;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}	
	
	public void printdata() {
		for(String car:carname) {
			System.out.println(car);
		}
		for(Engine engineData:engine) {
			System.out.println(engineData.getModelyear());
		}
	}
}
