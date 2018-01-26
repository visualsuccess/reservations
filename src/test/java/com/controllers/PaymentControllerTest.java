package com.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.reservation.controllers.PaymentController;
import com.reservation.models.Payment;
import com.reservation.repository.PaymentRepository;

@RunWith(MockitoJUnitRunner.class)
public class PaymentControllerTest{
	
    @Mock
	private PaymentRepository paymentRepository;
	
	@InjectMocks
	private PaymentController paymentController;
	
	
	@Test

	public void testMakePayment(){
		String nameOncard = "John";
		String zipCode = "606015";
		String cardNumber = "123";
		String expirationMonth = "11";
		String expirationYear = "1234";
		
		Payment testPayment = new Payment();
		
		Mockito.when(paymentRepository.save(Mockito.isA(Payment.class))).thenReturn(testPayment);
		
		String resultPage = paymentController.makePayment(nameOncard, zipCode, cardNumber, expirationMonth, expirationYear);
       
		Mockito.verify(paymentRepository, times(1)).save(Mockito.isA(Payment.class));
		assertEquals("confirmationPage", resultPage);
		
		
	}	

}
