package com.melons.oop;

public class SalesPeople {
	private int baseSalary = 50000;
	private double commissionRate = .05;
	
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double calculateMonthlyPay(int totalSales) {
		double commission = commissionRate * totalSales;
		double monthlySalary = baseSalary / 12;
		return monthlySalary + commission;
	}
	

}
