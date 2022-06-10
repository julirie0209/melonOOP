package com.melons.orders;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class AbstractMelonOrder {
	private String orderType;
	private double tax;
	private String species;
	private int qty;
	private boolean hasShipped;
	
	public AbstractMelonOrder() {
		
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean isHasShipped() {
		return hasShipped;
	}

	public void setHasShipped(boolean hasShipped) {
		this.hasShipped = hasShipped;
	}

	public double getBasePrice() {
		double basePrice = ((Math.random() * (10 - 5)) + 5);
		
		LocalDateTime instance = LocalDateTime.now();
		
		if (instance.getHour() >= 8 && instance.getHour() <=11 
				&& instance.getDayOfWeek() != DayOfWeek.SATURDAY 
                && instance.getDayOfWeek() != DayOfWeek.SUNDAY) {
			basePrice += 4;
		}
		
		return basePrice;
	}

	public double getTotal(double basePrice) {
		
		if (getSpecies().equals("Christmas melon")){
			basePrice = basePrice * 1.5;
		} 
		
		double total = (1 + getTax()) * getQty() * basePrice;
		
		if (getOrderType().equals("international") && getQty() < 10) {
			total += 3;
		}
		
		return total;
	}
	
	public void markShipped() {
		this.hasShipped = true;
	}
}
	
	
