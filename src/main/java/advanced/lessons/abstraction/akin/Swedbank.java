package advanced.lessons.abstraction.akin;

public class Swedbank extends Bank {
    @Override
    int getRateOfInterest() {
        return 3;
    }

    void deposit() {
        System.out.println("deposit for Swedbank");
    }
}
