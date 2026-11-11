package com.prakarsh.razorpay.common.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

@Embeddable
public class Money {
    private String currency;
    private int amountUnits;

    private Money(String currency, int amountUnits) {
        this.currency = currency;
        this.amountUnits = amountUnits;
    }

    public static Money of(String currency, int amountUnits) {
        return new Money(currency, amountUnits);
    }

    public static Money inr(int amountUnits) {
        return new Money("INR", amountUnits);
    }

    public Money add(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add Money with different currencies");
        }
        return new Money(this.currency, this.amountUnits + other.amountUnits);
    }

   public Money subtract(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot subtract Money with different currencies");
        }
        return new Money(this.currency, this.amountUnits - other.amountUnits);
    }
}
