package com.reservation;

import static org.mockito.Mockito.times;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseInitializerTest {

	@Mock
	private RoomTypeRepository roomTypeRepository;

	@InjectMocks
	private DatabaseInitializer databaseInitializer;
	
	@Test
	public void testInitData() throws Exception {
		
		Mockito.when(roomTypeRepository.save(Mockito.isA(RoomType.class))).thenReturn(new RoomType());
		
		databaseInitializer.initData();

		Mockito.verify(roomTypeRepository, times(3)).save(Mockito.isA(RoomType.class));
	}

}
