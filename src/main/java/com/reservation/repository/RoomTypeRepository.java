package com.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.RoomType;

/*
 * CrudRepository
 */

@RepositoryRestResource
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer>{
	
}
