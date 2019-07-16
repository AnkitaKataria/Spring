package com.ajay;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Test implements InitializingBean, DisposableBean {

	public String driverName;
	public String url;
	
/*
 * First bean object is created,
 * Second, setter DI is done
 * Third, init bean is called
 *  */
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing.."+driverName+"..."+url);
		//Class.forName(driverName);
		//Logic to establish connection	
	}
	
	@Override
	public void destroy() throws Exception {
		//Connection closed
		System.out.println("Destroy");		
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	
}
