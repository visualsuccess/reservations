package com.reservation;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseInitializerTest {

	@Mock
	private RoomTypeRepository roomTypeRepository;

	@InjectMocks
	private DatabaseInitializer databaseInitializer;
	
	@Test
	public void testInit() throws Exception {
		
		//Mockito.when(roomTypeRepository.save(Mockito.isA(RoomType.class)));
		
		databaseInitializer.initRoomTypes();

		//Mockito.verify(roomTypeRepository.save(Mockito.isA(RoomType.class)));
	}

}
