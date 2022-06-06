package com.melons.oop;

public class InternSalesPeople extends SalesPeople {
	private int baseSalary = 20000;
	
	public double calculateMontlyPay(int totalSales) {
		double commission = super.getCommissionRate() * totalSales;
		double monthlySalary = baseSalary / 12;
		return monthlySalary + commission;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

}
