package com.ajay;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ajay") // class level annotation
public class EmpCrudController {

	

	@RequestMapping(value = "/empsave", method = RequestMethod.GET)
	public ModelAndView empsave(@Valid @ModelAttribute("emp") Employee emp, BindingResult result) throws Exception {
		// Model attribute will extract all request parameters and bind it to Employee
		// model object.Name of req param and object properties must be same

		// BindingResult is used to check if there is any binding related error.
		if (result.hasErrors()) {
			return new ModelAndView("empsave");

		}

		ModelAndView model = new ModelAndView("success");
		return model;
	}
}
