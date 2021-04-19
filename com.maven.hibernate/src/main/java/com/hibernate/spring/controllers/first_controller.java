package com.hibernate.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import com.hibernate.spring.dao.Customer_dao_interface;
import com.hibernate.spring.entity.Customer;

@Controller
public class first_controller {
	
	@Autowired
	Customer_dao_interface customer_interface;

	@GetMapping("/")
	public String home(Model model) {
		
	  List<Customer> customers = customer_interface.getCustomers();
	  model.addAttribute("customers", customers);
		
		return "home";
	}
}
