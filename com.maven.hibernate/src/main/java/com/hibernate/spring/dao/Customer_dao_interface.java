package com.hibernate.spring.dao;

import java.util.List;

import com.hibernate.spring.entity.Customer;

public interface Customer_dao_interface {
	
	public List<Customer>getCustomers();
	
	public void saveCustomer(Customer customer);
	
	public Customer getCustomer(Integer id);
	
	public void deleteCustomer(Customer customer);

}
