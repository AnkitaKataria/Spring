package com.ajay;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
public class HelloController implements Controller{

	@Override
	@RequestMapping("/helloWorld.aj")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		Map m=new HashMap();
		m.put("msg", "Hello.."+name);
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
	}

}
