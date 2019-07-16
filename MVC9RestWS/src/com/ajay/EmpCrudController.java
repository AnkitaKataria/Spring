package com.ajay;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


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
}
