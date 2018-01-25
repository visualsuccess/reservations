package com.reservation;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reservation.models.Payment;
import com.reservation.models.Room;
import com.reservation.models.RoomType;
import com.reservation.repository.PaymentRepository;
import com.reservation.repository.RoomRepository;
import com.reservation.repository.RoomTypeRepository;

@Component
public class DatabaseInitializer {
	private static final Log LOGGER = LogFactory.getLog(DatabaseInitializer.class);
	@Autowired
	private RoomTypeRepository roomTypeRepository;
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private PaymentRepository paymentRepository;
	
	@PostConstruct
	public void initData() {
		initRoomTypes();
		initRooms();	
		initPayment();
	}

	private void initRoomTypes() {
		roomTypeRepository.save(new RoomType(1, "Standard", new BigDecimal(100.00)));
		roomTypeRepository.save(new RoomType(2, "Family", new BigDecimal(150.00)));
		roomTypeRepository.save(new RoomType(3, "Suite", new BigDecimal(200.00)));
		LOGGER.info("Created RoomTypes: " + roomTypeRepository.count());
		System.out.println("Created RoomTypes: " + roomTypeRepository.count());
	}
	private void initRooms() {
		int i=1;
		for(;i<8;i++){
			roomRepository.save(new Room(i,"1" ,true));
		}
		for(;i<15;i++){
			roomRepository.save(new Room(i,"2" ,true));
		}
		for(;i<21;i++){
			roomRepository.save(new Room(i,"3" ,true));
		}	
			
		LOGGER.info("Created Room: " + roomRepository.count());
		System.out.println("Created Room: " + roomRepository.count());
	}
	//(String nameOnCard,String cardNumber, String zipCode,int expirationMonth,int expirationYear){
	private void initPayment(){
		paymentRepository.save(new Payment("Scott","44218569736987412","60601",1,12));
		LOGGER.info("Payment received: " + paymentRepository.count());
		System.out.println("Payment received: " + paymentRepository.count());
		
	}
}
