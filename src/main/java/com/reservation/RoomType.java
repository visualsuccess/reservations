package com.reservation;

import java.math.BigDecimal;

public class RoomType {
	private String Style;
	private BigDecimal Price;
	private int typeId;
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	public String getStyle() {
		return Style;
	}
	public void setStyle(String style) {
		Style = style;
	}
	
	

}
