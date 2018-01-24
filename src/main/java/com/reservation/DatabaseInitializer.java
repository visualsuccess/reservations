package com.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reservation.repository.RoomTypeRepository;

@Component
public class DatabaseInitializer {
	
@Autowired
private RoomTypeRepository roomTypeRepository;
}
