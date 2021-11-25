package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.exceptions.NoSuchCustomerException;
import com.capgemini.model.Bill;
import com.capgemini.model.ConnectionType;

public interface BillService {
	public Bill viewBillByConsumerNumber(Long consumerNumber) throws NoSuchCustomerException;
	public Bill viewBillByMobileNumber(String mobile) throws NoSuchCustomerException;
	public Bill viewBillByEmail(String email) throws NoSuchCustomerException;
	public List<Bill> viewBillForDateRange(LocalDate from, LocalDate to);
	public double enrgeyBillCalculator(ConnectionType type, double unitsConsumed);
	public void emailBillToCustomer(Long consumerNumber, String email)throws NoSuchCustomerException;
}
