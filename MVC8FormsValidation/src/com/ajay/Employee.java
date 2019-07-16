package com.ajay;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	@Size(min=1,max=3, message="Enter correct name between {min} and {max}")//If we dont provide customize message, it will show default message
	/*
	 * If using properties file for messages- 
	 * @Size(min=1,max=3)
	 */
	
	private String name;
	@Pattern(regexp = "")//It is used for pattern for fields
	private String department;
	@Max(999999999)//If value is greater than this, generate error
	private int mobile=0;
	
	@isHobbby
	private String hobby;;
	
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

}
