package com.melons.orders;

public class DomesticMelonOrder extends AbstractMelonOrder {
	private String orderType = "domestic";
	double tax = 0.08;
	
	public DomesticMelonOrder(String species, int qty) {
		super.setSpecies(species);
		super.setQty(qty);
		super.setHasShipped(false);
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
	
	
	
}
