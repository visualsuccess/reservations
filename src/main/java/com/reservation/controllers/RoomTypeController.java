package com.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@RestController
public class RoomTypeController {
	
	@Autowired
	private RoomTypeRepository roomTypeRepository;
	
	public Iterable<RoomType> retrieveRoomTypes(){
		return roomTypeRepository.findAll();
	}

}
