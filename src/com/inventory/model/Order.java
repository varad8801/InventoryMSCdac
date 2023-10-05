package com.inventory.model;


import java.util.Date;
import java.util.List;




public class Order { 
	
	
	private int orderId;
	private String orderName;
	private Date orderDate;
	
	private Orderer orderer;
	
	private List<Product> product;
	
	
	
	
	private Payment payment;
	
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
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Orderer getOrderer() {
		return orderer;
	}
	public void setOrderer(Orderer orderer) {
		this.orderer = orderer;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderDate=" + orderDate + ", orderer=" + orderer
				+ ", product=" + product +", payment=" + payment + "]";
	}
	
}
