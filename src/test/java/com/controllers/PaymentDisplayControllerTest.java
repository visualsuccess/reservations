package com.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.reservation.controllers.PaymentDisplayController;

@RunWith(MockitoJUnitRunner.class)
public class PaymentControllerTest {
	@InjectMocks
	private PaymentDisplayController paymentDisplayController;
	
	@Test
	public void testPaymentController(){
		String s= paymentDisplayController.displayPayment();
		org.junit.Assert.assertEquals("payment", s);
		
		
	}

}
