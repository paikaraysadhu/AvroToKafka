package org.dw.dto;

import java.io.Serializable;

public class Sales_credit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private String currency;
	private String amount;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sales_credit [currency=" + currency + ", amount=" + amount + "]";
	}

}
