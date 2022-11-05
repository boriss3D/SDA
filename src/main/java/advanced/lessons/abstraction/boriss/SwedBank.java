package advanced.lessons.abstraction.boriss;

public class SwedBank extends Bank {

    public SwedBank(int rateOfInterest) {
        super(rateOfInterest);
    }

    @Override
    int getRateOfInterest() {
        return this.getRate();
    }
}
