package com.inventory.model;


import java.util.Date;


public class Payment {

	private int Id;
	private String paymentMode;
	private String transactionId;
	private Date paymentDate;
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "Payment [Id=" + Id + ", paymentMode=" + paymentMode + ", transactionId=" + transactionId
				+ ", paymentDate=" + paymentDate + "]";
	}
}
