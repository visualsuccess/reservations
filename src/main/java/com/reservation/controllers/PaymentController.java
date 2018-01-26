package com.reservation.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.reservation.models.Payment;
import com.reservation.repository.PaymentRepository;


@Controller
public class PaymentController {

	@Autowired
	private Payment payment;
	@Autowired
	private PaymentRepository paymentRepository;

	@GetMapping("/makePayment")
	public String makePayment(HttpServletRequest request){
		String nameOnCard=request.getParameter("nameoncard");
		String cardNumber=request.getParameter("cardnumber");
		String zipCode=request.getParameter("zip");
		String expirationMonth=request.getParameter("month");
		String expirationYear=request.getParameter("year");
		
		
		makePayment(nameOnCard, zipCode, cardNumber, expirationMonth, expirationYear);
		
		/*payment.setCardNumber(cardNumber);
		payment.setExpirationMonth(Integer.parseInt(expirationMonth));
		payment.setNameOnCard(nameOnCard);
		payment.setZipCode(zipCode);
		payment.setExpirationYear(Integer.parseInt(expirationYear));
		
		paymentRepository.save(payment);
		System.out.println(payment.getCardNumber());*/
		return "confirmationPage";
		
	}
	@GetMapping("/makePayment2")
	public String makePayment(String nameOncard2, String zipCode2, String cardNumber2, String expirationMonth,
			String expirationYear) {
		
		Payment payment = new Payment(nameOncard2,cardNumber2,zipCode2,Integer.parseInt(expirationMonth), Integer.parseInt(expirationYear));
		paymentRepository.save(payment);
		
		return "confirmationPage";
	}
	
	

}
