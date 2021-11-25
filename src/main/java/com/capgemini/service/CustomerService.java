package com.capgemini.service;

import java.util.List;

import com.capgemini.exceptions.DuplicateCustomerException;
import com.capgemini.exceptions.NoSuchCustomerException;
import com.capgemini.model.Customer;

public interface CustomerService {
	// check for Duplicate aadhar, email, mobile
	public Customer registerCustomer(Customer customer)throws DuplicateCustomerException;
	public Customer viewCustomerProfile(int customerId)throws NoSuchCustomerException;
	public Customer editCustomerProfile(int customerId)throws NoSuchCustomerException;
	public Customer searchCustomerByCustomerId(Long customerId)throws NoSuchCustomerException;
	public Customer searchCustomerByEmail(String email)throws NoSuchCustomerException;
	public Customer searchCustomerByAadhar(String aadharNumber)throws NoSuchCustomerException;
	public Customer searchCustomerByMobile(String mobile)throws NoSuchCustomerException;
	public List<Customer> searchCustomerByName(String customerName)throws NoSuchCustomerException;
}
