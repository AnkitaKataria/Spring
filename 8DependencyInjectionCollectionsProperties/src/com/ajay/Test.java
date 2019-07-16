package com.ajay;

import java.util.Properties;
import java.util.Set;

public class Test {

	private Properties driver;
	public void printData() {
		Set keys=driver.keySet();
		for(Object key:keys) {
			System.out.println("Key="+key+" value="+driver.get(key));
		}
	}
	public Properties getDriver() {
		return driver;
	}
	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	
}
