package com.reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.Room;


/*
 * CrudRepository
 */

@RepositoryRestResource
public interface RoomRepository extends CrudRepository<Room, Integer>{

		
}
