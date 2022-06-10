package com.melons.orders;

public class GovernmentMelonOrder extends AbstractMelonOrder {
	
	private String orderType = "government";
	private boolean passedInspection;
	
	public GovernmentMelonOrder(boolean passOrFail) {
		
		String species = super.setSpecies();
		int qty = super.getQty();
		this.passedInspection = passOrFail;
	}
	
	public void markInspection(boolean passed) {
		this.passedInspection = passed;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


}
