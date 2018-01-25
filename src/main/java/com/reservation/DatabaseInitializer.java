package com.reservation;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@Component
public class DatabaseInitializer {

	private static final Log LOGGER = LogFactory.getLog(DatabaseInitializer.class);
	
	@Autowired
	private RoomTypeRepository roomTypeRepository;

	@PostConstruct
	public void initData() {
		initRoomTypes();

	}

	private void initRoomTypes() {
		roomTypeRepository.save(new RoomType(1, "Test1", new BigDecimal(100)));
		roomTypeRepository.save(new RoomType(2, "Test2", new BigDecimal(99.99)));
		roomTypeRepository.save(new RoomType(3, "Test3", new BigDecimal(99.98)));
		
		LOGGER.info("Created RoomTypes: " + roomTypeRepository.count());
	}
	
}
