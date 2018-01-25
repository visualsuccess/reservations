package com.reservation.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Room")
public class Room{
	@Id
	private int roomNumber;
	private String typeId;
	private boolean available;
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

}
