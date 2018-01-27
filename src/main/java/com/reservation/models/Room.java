package com.reservation.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Room")
public class Room{
	@Id
	private int roomNumber;
	private String typeId;
	private boolean available;
	
    @ManyToOne
    @JoinColumn
	private RoomType roomType;
    
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "room")
    private List<Reservation> reservations;
	
	public Room(){
		
	}

	public Room(int i, String typeID, boolean available){
		this.roomNumber=i;
		this.typeId=typeID;
		this.available=available;
		
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public List<Reservation> getReservations() {
		if (this.reservations == null) {this.reservations = new ArrayList<>(); }
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	
}
