package com.atguigu.exer2;

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order(1001, "AA");
		Order order2 = new Order(1001, "AA");
		
		System.out.println(order1.equals(order2));
		
		Order order3 = new Order(1001,"BB");
		System.out.println(order2.equals(order3));
	}
}

class Order {
	private int orderId;
	private String orderName;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Order order = (Order) obj;

		return this.orderId == order.orderId && this.orderName.equals(order.orderName);
	}
}