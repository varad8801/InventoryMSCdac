package com.inventory.model;


public class proPricing {
	
	
	private int Id;
	  private double unitPrice;
	    private double costPrice;
	    private double bulkPrice;
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public double getCostPrice() {
			return costPrice;
		}
		public void setCostPrice(double costPrice) {
			this.costPrice = costPrice;
		}
		public double getBulkPrice() {
			return bulkPrice;
		}
		public void setBulkPrice(double bulkPrice) {
			this.bulkPrice = bulkPrice;
		}
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		@Override
		public String toString() {
			return "proPricing [Id=" + Id + ", unitPrice=" + unitPrice + ", costPrice=" + costPrice + ", bulkPrice="
					+ bulkPrice + "]";
		}
		

}
