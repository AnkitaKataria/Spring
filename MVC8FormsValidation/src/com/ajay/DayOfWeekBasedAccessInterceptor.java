package com.ajay;



import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DayOfWeekBasedAccessInterceptor implements HandlerInterceptor {


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Its interceptor");
		Calendar cal=Calendar.getInstance();
		int day=cal.get(cal.DAY_OF_WEEK);
		if(day==1) {
			response.getWriter().write("Website is down for maintenance");
			return false;
		}
			return true; 
	}
}
