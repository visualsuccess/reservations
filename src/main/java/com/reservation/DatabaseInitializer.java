package com.reservation;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@Component
public class DatabaseInitializer {

	@Autowired
	private RoomTypeRepository roomTypeRepository;

	@PostConstruct
	public void innitRoomTypes() {
		roomTypeRepository.save(new RoomType(1, "Test", new BigDecimal(100)));
	}

}
