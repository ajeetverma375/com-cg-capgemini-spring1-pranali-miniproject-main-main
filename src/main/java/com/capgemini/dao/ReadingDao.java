package com.capgemini.dao;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.model.Reading;

public interface ReadingDao {
	public Reading selfSubmitReading(Reading reading);
	public Reading readMeterReadingByConsumerNumberAndBillDate(Long consumerNumber, LocalDate billDate);
	public List<Reading> readMeterReadingByConsumerNumber(Long consumerNumber);
}
