package com.reservation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "Payment")
public class Payment {

	@Id @GeneratedValue long guestId;
	//private int confirmationNumber;
	private String nameOnCard;
	private String cardNumber;
	private String zipCode;
	private int expirationMonth;
	private int expirationYear;
	
	public Payment(String nameOnCard,String cardNumber, String zipCode,int expirationMonth,int expirationYear){
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.zipCode = zipCode;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}
	
	public Payment(){
		
	}

	/*public int getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}*/
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public int getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	
}
