package com.ajay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="",method = RequestMethod.GET) // Class level annotation
public class EmpRESTController {
	@RequestMapping(value = "/get_temp_ajax", method = RequestMethod.GET)
	public ResponseEntity<TemperatureResponse> getTemperature(@RequestParam(value="id") String city){		
		TemperatureResponse response=new TemperatureResponse();
		response.getCityTemperature(city);
		return ResponseEntity.ok(response);
	}
}

class TemperatureResponse{
	String status;
	List<CityTemp> data=new ArrayList<>();
	public TemperatureResponse getCityTemperature(String city) {
		this.setData((Arrays.asList(
                new CityTemp("Indore", 30),
                new CityTemp("Delhi", 40)
        )));
		if(data.size()>0) {
			this.setStatus("success");
		}
		return this;		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<CityTemp> getData() {
		return data;
	}
	public void setData(List<CityTemp> data) {
		this.data = data;
	}
}

class CityTemp{
	String city;
	int temp;
	public CityTemp(String city, int temp) {
		super();
		this.city = city;
		this.temp = temp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
}
