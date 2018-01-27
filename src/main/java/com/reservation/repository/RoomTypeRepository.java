package com.reservation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.RoomType;

/*
 * CrudRepository
 */

@RepositoryRestResource
public interface RoomTypeRepository extends CrudRepository<RoomType, Integer>{
	
	@Query("SELECT rt FROM RoomType rt ") //join Room r on r.roomType = rt.roomType join Reservation res on res.room = r.room where res.checkinDate > ?0 and res.checkoutDate > ?0 ")
	public Iterable<RoomType> findAvaliableRooms (); // (Date checkInDate, Date checkOutDate); //Date checkInDate, Date checkOutDate
	
}
