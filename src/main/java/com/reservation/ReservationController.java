package com.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reservation.models.RoomType;
import com.reservation.repository.RoomTypeRepository;

@Controller
public class ReservationController {
	@Autowired
	private RoomTypeRepository roomTypeRepository;
	
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/availableRooms")
	public String availableRooms(Model model) {
//		Iterable<RoomType> roomTypes = roomTypeRepository.findAvaliableRooms();
//		model.addAttribute("roomTypes", roomTypes);
		return "availableRooms";
	}
}
