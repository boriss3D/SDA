package advanced.lessons.homework.boriss;

public class Salary {
    private final int amount;
    private final Currency currency;

    public Salary(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
