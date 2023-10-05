package com.inventory.model;


import java.util.List;


public class Orderer {
	
	private int Id;
	private String Name;
	private String Email;
	
	private List<OrdererAddress> oAddress;
	
	private List<Order> Orders;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<OrdererAddress> getoAddress() {
		return oAddress;
	}
	public void setoAddress(List<OrdererAddress> oAddress) {
		this.oAddress = oAddress;
	}
	public List<Order> getOrders() {
		return Orders;
	}
	public void setOrders(List<Order> orders) {
		Orders = orders;
	}
	@Override
	public String toString() {
		return "Orderer [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", oAddress=" + oAddress + ", Orders="
				+ Orders + "]";
	}
	
}
