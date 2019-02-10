package com.ing.app.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ing.app.CustomerInitialization;
import com.ing.app.customer.classification.service.impl.ClassificationStrategyServiceContext;
import com.ing.app.model.Customer;
import com.ing.app.model.RequestForm;

@Controller
@RequestMapping(value = "/")
public class CustomerController {
		
	final String viewName = "showCustomerHabits";
	
	@Autowired
	ClassificationStrategyServiceContext cssc;
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("customer", "crForm", new RequestForm());
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("crForm") RequestForm crForm) throws ParseException {
		ModelAndView model = new ModelAndView(viewName);
		
		Customer cr1 = CustomerInitialization.initializeCustomer1();
		model.addObject("crForm", crForm);
		model.addObject("cr1", cr1);

		return model;
	}
	
}
