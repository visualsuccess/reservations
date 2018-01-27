package com.reservation.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.RoomType;

/*
 * CrudRepository
 */

@RepositoryRestResource
public interface RoomTypeRepository extends CrudRepository<RoomType, Integer>{
	
	@Query("SELECT rt FROM RoomType rt ") //WHERE rt.typeId = 1
	public Iterable<RoomType> findAvaliableRooms (Date checkInDate, Date checkOutDate); //Date checkInDate, Date checkOutDate
	//TODO: reservation table needs to be initialized in DatabaseInitializer.java
	
}
