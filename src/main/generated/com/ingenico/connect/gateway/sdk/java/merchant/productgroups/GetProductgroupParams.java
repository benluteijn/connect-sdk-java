/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.productgroups;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

/**
 * Query parameters for
 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__productgroups__paymentProductGroupId__get">Get payment product group</a>
 */
public class GetProductgroupParams extends AbstractParamRequest {

	private Long amount;

	private List<String> hide;

	private Boolean isRecurring;

	private String countryCode;

	private String locale;

	private String currencyCode;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public List<String> getHide() {
		return hide;
	}

	public void setHide(List<String> value) {
		this.hide = value;
	}

	/**
	 * @deprecated Use {@link #setHide(List)} or {@link #addHide(String)} instead.
	 */
	@Deprecated
	public void setHide(String value) {
		this.hide = null;
		if (value != null) {
			addHide(value);
		}
	}

	public void addHide(String value) {
		if (this.hide == null) {
			this.hide = new LinkedList<String>();
		}
		this.hide.add(value);
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String value) {
		this.locale = value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		addParameter(result, "amount", amount);
		addParameter(result, "hide", hide);
		addParameter(result, "isRecurring", isRecurring);
		addParameter(result, "countryCode", countryCode);
		addParameter(result, "locale", locale);
		addParameter(result, "currencyCode", currencyCode);
		return result;
	}
}