package com.reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {
	
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
}
