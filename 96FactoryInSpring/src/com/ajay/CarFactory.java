package com.ajay;

import org.springframework.stereotype.Component;

public class CarFactory {

	private static String carname;

	public static Car getInstance() throws Exception {
		Car c=(Car) Class.forName(carname).newInstance();
		return c;
	}

	public static String getCarname() {
		return carname;
	}

	public static void setCarname(String carname) {
		CarFactory.carname = carname;
	}
	

}
