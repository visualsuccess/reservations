package com.reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.models.RoomType;

@RepositoryRestResource
public interface RoomTypeRepository extends CrudRepository<RoomType, Integer>{

}
