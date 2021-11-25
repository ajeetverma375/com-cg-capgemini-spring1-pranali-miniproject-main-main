package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.controller.PaymentController;
import com.capgemini.exceptions.NoSuchCustomerException;
import com.capgemini.model.Payment;
import com.capgemini.model.PaymentStatus;
import com.capgemini.repository.PaymentRepository;

@Service("paymentservice")
public class PaymentServiceImpl implements IPaymentService {

	private static final Logger LOG = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	PaymentRepository paymentRepo;
	
	@Override
	public PaymentStatus payBill(Payment payment) {
		LOG.info("payBill");
		Optional<Payment> paymentOpt = paymentRepo.findById(payment);
		if (paymentOpt.isPresent()) {
			LOG.info(" Success");
			return ((Payment) paymentRepo).getStatus();
		} else {
			LOG.info(" Failed");
		}
		return null;
	}

	@Override
	public void sendEmailOnPaymentCompletion(Long paymentId, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Payment> viewHistoricalPayment(Long consumerNumber){
		List<Payment> list = paymentRepo.findByConsumerNumber(consumerNumber);
		if (!list.isEmpty()) {
			LOG.info("find all historical payment");
			return list;
		}
		else {
		LOG.error("No such record found");
		throw new NoSuchCustomerException("No such record found");
		}
	}

}



//
//
//@Override
//public PaymentStatus payBill(Payment payment) {
//	LOG.info("payBill");
//	Optional<Payment> paymentOpt = paymentRepository.findById(payment);
//	if (paymentOpt.isPresent()) {
//		LOG.info(" Success");
//		return ((Payment) paymentRepository).getStatus();
//	} else {
//		LOG.info(" Failed");
//	}
//	return null;
//}
//
//@Override
//public void sendEmailOnPaymentCompletion(Long consumerNumber, String email) {
//	LOG.info("sendEmailOnPaymentCompletion");
//	
//	Customer paymentOpt = paymentRepository.findByConsumerNumber(consumerNumber);
//	if (paymentOpt.equals(consumerNumber)) {
//		paymentRepository.;
//		LOG.info("Employee id is deleted.");
//		return empOpt.get();
//	} else {
//		LOG.info("Employee is NOT available.");
//		throw new EmployeeNotFoundException(eid + " this employee id is not found.");
//	}
//}
