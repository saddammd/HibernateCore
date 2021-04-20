package com.hibernate.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/addCustomer")
	public String addCustomers(Model model) {
		
		Customer customer = new Customer();
		model.addAttribute("newCustomer",customer);
		
		return "addCustomer";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomers(@ModelAttribute("newCustomer") Customer customer) {
		
		customer_interface.saveCustomer(customer);
		
		return "redirect:/";
	}
	@GetMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("custId") Integer id, Model model) {
		
		Customer customer = customer_interface.getCustomer(id);
		model.addAttribute("newCustomer", customer);
		
		
		return "updateCustomer";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("deletecustid") Integer id) {
		
		Customer customer = customer_interface.getCustomer(id);
		customer_interface.deleteCustomer(customer);
		
		return "redirect:/";
	}
}
