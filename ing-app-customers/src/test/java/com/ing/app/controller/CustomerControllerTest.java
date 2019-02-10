package com.ing.app.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webAppContext;
	
	@Before
	public void setup() {
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webAppContext).build();
	}
	
	@Test
	public void showMainPage_testView() throws Exception {
		mockMvc.perform(get("/customer"))
			.andExpect(status().isOk())
			.andExpect(view().name("customer"))
			.andExpect(forwardedUrl("/WEB-INF/jsp/customer.jsp"));
	}
	
	@Test
	public void showCustomerHabitsPage_testView() throws Exception {
		mockMvc.perform(post("/customer"))
			.andExpect(status().isOk())
			.andExpect(view().name("showCustomerHabits"))
			.andExpect(forwardedUrl("/WEB-INF/jsp/showCustomerHabits.jsp"));
	}
	
}
