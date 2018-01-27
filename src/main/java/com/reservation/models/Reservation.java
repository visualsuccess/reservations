package com.reservation.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation {
	 @Id @GeneratedValue long confirmationNumber;
	
	private int roomId;
	private Date checkinDate;
	private Date checkoutDate;
	
	private int cardId;
	
    @ManyToOne
    @JoinColumn
	private Room room;
	
	public Reservation(){
		
	}
	
    public Reservation(int roomId,Date checkinDate,Date checkoutDate,int cardId){
    	this.roomId=roomId;
    	this.checkinDate=checkinDate;
    	this.checkoutDate=checkoutDate;
    	this.cardId=cardId;
		
	}
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public int getConfirmationNumber() {
		return (int) confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	

}
