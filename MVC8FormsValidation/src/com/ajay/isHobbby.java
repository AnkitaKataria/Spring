package com.ajay;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface isHobbby {
	String message() default "Please provide valid hobby" + "accepted hobbies are music, sporst";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
