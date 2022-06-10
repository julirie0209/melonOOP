package com.melons.orders;

public class InternationalMelonOrder extends AbstractMelonOrder {
	private String orderType = "international";
	private double tax = 0.17;
	private String countryCode;
	
	public InternationalMelonOrder(String species, int qty, String code) {
		super.setSpecies(species);
		super.setQty(qty);
		this.countryCode = code;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String getCountryCode() {
		
		return this.getCountryCode();
	}
}
