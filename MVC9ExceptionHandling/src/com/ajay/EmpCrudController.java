package com.ajay;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ajay") // class level annotation
public class EmpCrudController {

	@RequestMapping(value = "/empsave", method = RequestMethod.GET)
	public ModelAndView empsave(@ModelAttribute("emp") Employee emp, BindingResult result) throws Exception {
		String exception="NULL_POINTER";
		if(exception.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null pointer");
		}
		
		if (result.hasErrors()) {
			return new ModelAndView("empsave");
		}
		ModelAndView model = new ModelAndView("success");
		return model;
	}

	//Instead of creating exception handler methods in controller class, we will create a global controller class
	//which can be used by all controllers
	/*@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointer(NullPointerException e) {
		System.out.println("Null pointer exception occurred");
		return "NullPointerException";
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleUnknownExc(Exception e) {
		System.out.println("Unknown exception occurred");
		return "NullPointerException";
	}*/
}
