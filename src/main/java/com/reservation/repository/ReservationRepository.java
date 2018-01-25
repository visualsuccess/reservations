package com.reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.Reservation;



/*
 * CrudRepository
 */

@RepositoryRestResource
public interface ReservationRepository extends CrudRepository<Reservation, Integer>{

		
}