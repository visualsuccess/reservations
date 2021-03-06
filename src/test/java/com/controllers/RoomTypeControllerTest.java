package com.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.reservation.controllers.RoomTypeController;
import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@RunWith(MockitoJUnitRunner.class)
public class RoomTypeControllerTest {
	
	@Mock
	private RoomTypeRepository roomTypeRepository;
	
	@InjectMocks
	private RoomTypeController roomTypeController;
	
	@Test
	public void testRetrieveRoomTypes() throws Exception {
		Iterable<RoomType> mockRoomTypes = Mockito.mock(Iterable.class);
		Mockito.when(roomTypeRepository.findAll()).thenReturn(mockRoomTypes);
		
		Iterable<RoomType> actual = roomTypeController.retrieveRoomTypes();
		
		Assert.assertEquals(mockRoomTypes ,actual);
	}

}
