package com.ajay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class CarBeanWithAnnotation {

	private String carname;//For primitive, setter is must
	@Autowired	//Internally used byTYpe.Inject automatically Engine bean in Car
	@Qualifier("e")//It tells that this obj is qualified for auto wiring
	//@Qualifier resolves ambiguity problem of byType
	private Engine engine; //Using annotation, no setters/constructors are required
	
	public void carData() {
		System.out.println(carname+".."+engine.getModelyear());
	}

	public String getCarname() {
		return carname;
	}

	@Required//This makes a variable value must.
	public void setCarname(String carname) {
		this.carname = carname;
	}
}
