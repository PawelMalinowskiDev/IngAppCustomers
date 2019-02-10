package com.ing.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class CustomerController {
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("customer");
	}

}