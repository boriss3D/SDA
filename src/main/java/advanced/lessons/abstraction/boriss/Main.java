package advanced.lessons.abstraction.boriss;

public class Main {
    public static void main(String[] args) {
        SwedBank swedbank = new SwedBank(3);

        System.out.println(swedbank.getRateOfInterest());
    }
}
