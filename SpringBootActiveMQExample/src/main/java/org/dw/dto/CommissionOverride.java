package org.dw.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommissionOverride implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String commissionOverrideType;
	private String commissionID;
	private String commissionOverrideDesc;
	private BigDecimal commissionAmount;
	private BigDecimal secOverride;
	private BigDecimal tafOverride;

	public String getCommissionOverrideType() {
		return commissionOverrideType;
	}

	public void setCommissionOverrideType(String commissionOverrideType) {
		this.commissionOverrideType = commissionOverrideType;
	}

	public String getCommissionID() {
		return commissionID;
	}

	public void setCommissionID(String commissionID) {
		this.commissionID = commissionID;
	}

	public String getCommissionOverrideDesc() {
		return commissionOverrideDesc;
	}

	public void setCommissionOverrideDesc(String commissionOverrideDesc) {
		this.commissionOverrideDesc = commissionOverrideDesc;
	}

	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public BigDecimal getSecOverride() {
		return secOverride;
	}

	public void setSecOverride(BigDecimal secOverride) {
		this.secOverride = secOverride;
	}

	public BigDecimal getTafOverride() {
		return tafOverride;
	}

	public void setTafOverride(BigDecimal tafOverride) {
		this.tafOverride = tafOverride;
	}

	@Override
	public String toString() {
		return "CommissionOverride [commissionOverrideType=" + commissionOverrideType + ", commissionID=" + commissionID
				+ ", commissionOverrideDesc=" + commissionOverrideDesc + ", commissionAmount=" + commissionAmount
				+ ", secOverride=" + secOverride + ", tafOverride=" + tafOverride + "]";
	}

}
