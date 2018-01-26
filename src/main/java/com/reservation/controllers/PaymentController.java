package com.reservation.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.models.Payment;
import com.reservation.repository.PaymentRepository;


@RestController
public class PaymentController {

	@Autowired
	private Payment payment;
	private PaymentRepository paymentRepository;

	@GetMapping("/makePayment")
	public void retrieveRoomTypes(HttpServletRequest request){
		String nameOnCard=request.getParameter("");
		String cardNumber=request.getParameter("");
		String zipCode=request.getParameter("");
		String expirationMonth=request.getParameter("");
		String expirationYear=request.getParameter("");
		
		payment.setCardNumber(cardNumber);
		payment.setExpirationMonth(Integer.parseInt(expirationMonth));
		payment.setNameOnCard(nameOnCard);
		payment.setZipCode(zipCode);
		payment.setExpirationYear(Integer.parseInt(expirationYear));
		
		paymentRepository.save(payment);
		
	}
	
	

}
