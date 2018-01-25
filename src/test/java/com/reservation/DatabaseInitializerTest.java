package com.reservation;

import static org.mockito.Mockito.times;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.reservation.models.Payment;
import com.reservation.models.Room;
import com.reservation.models.RoomType;
import com.reservation.repository.PaymentRepository;
import com.reservation.repository.RoomRepository;
import com.reservation.repository.RoomTypeRepository;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseInitializerTest {

	@Mock
	private RoomTypeRepository roomTypeRepository;
	
	@Mock
	private RoomRepository roomRepository;
	@Mock
	private PaymentRepository paymentRepository;

	@InjectMocks
	private DatabaseInitializer databaseInitializer;
	
	@Test
	public void testInitData() throws Exception {
		
		Mockito.when(roomTypeRepository.save(Mockito.isA(RoomType.class))).thenReturn(new RoomType());
		Mockito.when(roomRepository.save(Mockito.isA(Room.class))).thenReturn(new Room());
		Mockito.when(paymentRepository.save(Mockito.isA(Payment.class))).thenReturn(new Payment());
		
		//Mockito.when(roomRepository.count()).thenReturn(20l);
		
		databaseInitializer.initData();

		Mockito.verify(roomTypeRepository, times(3)).save(Mockito.isA(RoomType.class));
		Mockito.verify(roomRepository, times(20)).save(Mockito.isA(Room.class));
		Mockito.verify(paymentRepository, times(1)).save(Mockito.isA(Payment.class));
		//Mockito.verify(roomRepository, times(2)).count();
		
		
	}

}
