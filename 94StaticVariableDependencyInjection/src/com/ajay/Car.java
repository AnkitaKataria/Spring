package com.ajay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car {

	private static String carname;
	
	public static void carData() {
		System.out.println(carname);
	}

	public static void setCarname(String carname) {
		Car.carname = carname;
	}
}
