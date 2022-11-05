package advanced.lessons.abstraction.boriss;

public abstract class Bank {

    private final int rate;

    public Bank(int rateOfInterest) {
        this.rate = rateOfInterest;
    }

    public int getRate() {
        return rate;
    }

    abstract int getRateOfInterest();
}
