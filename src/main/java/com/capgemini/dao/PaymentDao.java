package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Payment;
import com.capgemini.model.PaymentStatus;

public interface PaymentDao {
	public PaymentStatus createBill(Payment payment);
	public List<Payment> readHistoricalPayment(Long consumerNumber);
}
