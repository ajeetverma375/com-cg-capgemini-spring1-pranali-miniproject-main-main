package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
	public Customer readCustomerProfile(int customerId);
	public Customer updateCustomerProfile(int customerId);
	public Customer readCustomerByCustomerId(Long customerId);
	public Customer readCustomerByEmail(String email);
	public Customer readCustomerByAadhar(String aadharNumber);
	public Customer readCustomerByMobile(String mobile);
	public List<Customer> readCustomerByName(String customerName);
}
