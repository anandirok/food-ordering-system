package com.food.ordering.system.domain.valueobject;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {
    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isGreaterThanZero(){
        return this.amount!=null && this.amount.compareTo(BigDecimal.ZERO)>0;
    }
    public boolean isGreaterThan(Money money){
        return this.amount!=null && this.amount.compareTo(money.getAmount())>0;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return this.amount.equals(money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.amount);
    }
}


