package com.reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.Payment;


/*
 * CrudRepository
 */

@RepositoryRestResource
public interface PaymentRepository extends CrudRepository<Payment, Integer>{
	
}
