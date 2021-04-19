package com.hibernate.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.spring.entity.Customer;

@Repository
@Transactional
class Customer_dao implements Customer_dao_interface {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		//Get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		// create qurey from session
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		
		
		// query will have result
		 List<Customer> result = query.getResultList();
		
		return result;
	}

	
}
