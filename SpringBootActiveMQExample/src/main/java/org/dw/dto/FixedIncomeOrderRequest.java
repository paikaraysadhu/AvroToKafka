package org.dw.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class FixedIncomeOrderRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String mt;
	private Boolean encrypted;
	private String wlpID;
	private String accountID;
	private String accountNo;
	private String instrumentID;
	private String side;
	private String orderQty;
	private BigDecimal price;
	private String orderType;
	private String userID;
	private String correlationID;
	private String orderID;
	private String orderNo;
	private String orderCapacity;
	private Boolean marginLiquidate;
	private CommissionOverride commissionOverride;

	private Boolean journalExcessFunds;
	private String isin;
	private Sales_credit sales_credit;
	private String currency;
	private String time_in_force;

	public String getMt() {
		return mt;
	}

	public void setMt(String mt) {
		this.mt = mt;
	}

	public Boolean getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	public String getWlpID() {
		return wlpID;
	}

	public void setWlpID(String wlpID) {
		this.wlpID = wlpID;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getInstrumentID() {
		return instrumentID;
	}

	public void setInstrumentID(String instrumentID) {
		this.instrumentID = instrumentID;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderCapacity() {
		return orderCapacity;
	}

	public void setOrderCapacity(String orderCapacity) {
		this.orderCapacity = orderCapacity;
	}

	public Boolean getMarginLiquidate() {
		return marginLiquidate;
	}

	public void setMarginLiquidate(Boolean marginLiquidate) {
		this.marginLiquidate = marginLiquidate;
	}

	public CommissionOverride getCommissionOverride() {
		return commissionOverride;
	}

	public void setCommissionOverride(CommissionOverride commissionOverride) {
		this.commissionOverride = commissionOverride;
	}

	public Boolean getJournalExcessFunds() {
		return journalExcessFunds;
	}

	public void setJournalExcessFunds(Boolean journalExcessFunds) {
		this.journalExcessFunds = journalExcessFunds;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public Sales_credit getSales_credit() {
		return sales_credit;
	}

	public void setSales_credit(Sales_credit sales_credit) {
		this.sales_credit = sales_credit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTime_in_force() {
		return time_in_force;
	}

	public void setTime_in_force(String time_in_force) {
		this.time_in_force = time_in_force;
	}

	@Override
	public String toString() {
		return "FixedIncomeOrderRequest [mt=" + mt + ", encrypted=" + encrypted + ", wlpID=" + wlpID + ", accountID="
				+ accountID + ", accountNo=" + accountNo + ", instrumentID=" + instrumentID + ", side=" + side
				+ ", orderQty=" + orderQty + ", price=" + price + ", orderType=" + orderType + ", userID=" + userID
				+ ", correlationID=" + correlationID + ", orderID=" + orderID + ", orderNo=" + orderNo
				+ ", orderCapacity=" + orderCapacity + ", marginLiquidate=" + marginLiquidate + ", commissionOverride="
				+ commissionOverride + ", journalExcessFunds=" + journalExcessFunds + ", isin=" + isin
				+ ", sales_credit=" + sales_credit + ", currency=" + currency + ", time_in_force=" + time_in_force
				+ "]";
	}

}
