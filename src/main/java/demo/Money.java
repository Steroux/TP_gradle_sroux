package demo;

import java.util.Objects;

public class Money {
    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString(){
        return this.amount+" "+this.currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return getAmount() == money.getAmount() && Objects.equals(getCurrency(), money.getCurrency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), getCurrency());
    }

    public Money add(Money that){
        return new Money(this.amount+ that.amount, this.currency);
    }
}
