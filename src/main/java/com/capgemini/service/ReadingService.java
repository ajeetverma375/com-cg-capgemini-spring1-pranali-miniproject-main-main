package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.exceptions.NoSuchCustomerException;
import com.capgemini.model.Reading;

public interface ReadingService {
	public Reading selfSubmitReading(Reading reading);
	public Reading findMeterReadingByConsumerNumberAndBillDate(Long consumerNumber, LocalDate billDate) throws NoSuchCustomerException;
	public List<Reading> findMeterReadingByConsumerNumber(Long consumerNumber) throws NoSuchCustomerException;
}
