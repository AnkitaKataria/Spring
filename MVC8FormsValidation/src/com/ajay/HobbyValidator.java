package com.ajay;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<isHobbby, String>{

	@Override
	public void initialize(isHobbby arg0) {		
	}

	@Override
	public boolean isValid(String empHobby, ConstraintValidatorContext ctx) {
		if(empHobby==null) {
			return false;
		}
		if(empHobby.matches("music|sports")) {
			return true;
		} else {
			return false;
		}
	}
}
