package com.melons.oop;

public class InternSalesPeople extends SalesPeople {
	private int baseSalary = 20000;

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double calculateMonthlyPay(int totalSales) {
		double commission = super.getCommissionRate() * totalSales;
		double monthlySalary = this.baseSalary / 12;
		return monthlySalary + commission;
	}

}
