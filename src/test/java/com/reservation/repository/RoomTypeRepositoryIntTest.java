package com.reservation.repository;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reservation.models.RoomType;


@RunWith (SpringRunner.class)
@SpringBootTest
public class RoomTypeRepositoryIntTest {
	
	@Autowired
	private RoomTypeRepository roomTypeRepository; 
	
	@Test
	public void testFindAvaliableRooms(){
		
		Date checkInDate = new Date(); 
		Date checkOutDate = new Date(); 
		
		Iterable<RoomType>  roomTypes =  roomTypeRepository.findAvaliableRooms(); //checkInDate, checkOutDate); //checkInDate, checkOutDate
		
		Assert.assertNotNull(roomTypes);
		Assert.assertEquals(1, roomTypes.iterator().next().getTypeId());
		
	}
}
