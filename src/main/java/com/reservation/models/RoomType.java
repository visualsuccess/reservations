package com.reservation.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoomType")
public class RoomType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer typeId;
	private String style;
	private BigDecimal price;

	public RoomType() {
	}

	public RoomType(int typeId, String style, BigDecimal price) {
		this.typeId = typeId;
		this.style = style;
		this.price = price;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
