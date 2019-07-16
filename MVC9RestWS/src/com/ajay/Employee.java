package com.ajay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)//Include only properties which are not null
@JsonIgnoreProperties({"department"})
@JsonPropertyOrder({"name", "mobile"})//Order in json response
public class Employee {
	
	@JsonProperty("EmployeeName")//Property name in json response
	private String name;
	private String department;
	private String mobile;
	List l;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List getL() {
		return l;
	}
	public void setL(List l) {
		this.l = l;
	}
	
}
