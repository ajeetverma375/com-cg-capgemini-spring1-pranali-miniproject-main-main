package com.capgemini.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;
import com.capgemini.model.Payment;
import com.capgemini.model.PaymentStatus;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	Optional<Payment> findById(Payment payment);

	Optional<Payment> exists(Long consumerNumber);
	
	@Query(name = "SELECT c FROM Customer c WHERE c.connection.consumerNumber = ?1")
	public abstract List<Payment> findByConsumerNumber(Long consumerNumber);

	List<Payment> findAllById(Long consumerNumber);
	
	public Payment findByPaymentId(Long partyId);
//	PaymentStatus getStatus();

//	boolean exists(Payment payment);
//
//	boolean existByPaymentId(Long paymentId);

}