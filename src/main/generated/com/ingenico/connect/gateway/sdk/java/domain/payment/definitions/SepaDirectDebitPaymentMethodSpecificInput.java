/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_SepaDirectDebitPaymentMethodSpecificInput">SepaDirectDebitPaymentMethodSpecificInput</a>
 */
public class SepaDirectDebitPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private String dateCollect = null;

	private String directDebitText = null;

	private Boolean isRecurring = null;

	private String recurringPaymentSequenceIndicator = null;

	private String token = null;

	private Boolean tokenize = null;

	public String getDateCollect() {
		return dateCollect;
	}

	public void setDateCollect(String value) {
		this.dateCollect = value;
	}

	public String getDirectDebitText() {
		return directDebitText;
	}

	public void setDirectDebitText(String value) {
		this.directDebitText = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public String getRecurringPaymentSequenceIndicator() {
		return recurringPaymentSequenceIndicator;
	}

	public void setRecurringPaymentSequenceIndicator(String value) {
		this.recurringPaymentSequenceIndicator = value;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String value) {
		this.token = value;
	}

	public Boolean getTokenize() {
		return tokenize;
	}

	public void setTokenize(Boolean value) {
		this.tokenize = value;
	}
}