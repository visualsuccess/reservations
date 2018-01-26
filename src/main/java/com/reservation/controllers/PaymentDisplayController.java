package com.reservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentDisplayController {
	@RequestMapping("/displaypayment")
	public String displayPayment(){
		
		
		
		return "payment";
	}

}
