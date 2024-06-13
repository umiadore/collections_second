package homework;

import java.util.Objects;

public class Data {

    private Double MoneyAmount;
    private int Interest;
    private int Years;

    public Data(Double moneyAmount, int interest, int years) {
        MoneyAmount = moneyAmount;
        Interest = interest;
        Years = years;
    }

    public Double getMoneyAmount() {
        return MoneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        MoneyAmount = moneyAmount;
    }

    public int getInterest() {
        return Interest;
    }

    public void setInterest(int interest) {
        Interest = interest;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int years) {
        Years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data data)) return false;
        return Interest == data.Interest && Years == data.Years && Objects.equals(MoneyAmount, data.MoneyAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MoneyAmount, Interest, Years);
    }

    @Override
    public String toString() {
        return "Data{" +
                "MoneyAmount=" + MoneyAmount +
                ", Interest=" + Interest +
                ", Years=" + Years +
                '}';
    }
}
