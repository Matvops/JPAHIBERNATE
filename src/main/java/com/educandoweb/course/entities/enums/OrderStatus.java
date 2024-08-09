package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	private int code;
	
	private OrderStatus(int i) {
		this.code = i;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int i) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == i) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code!");
	}
}
