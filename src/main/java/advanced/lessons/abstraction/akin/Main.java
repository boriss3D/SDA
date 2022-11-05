package advanced.lessons.abstraction.akin;

public class Main {
    public static void main(String[] args) {


        //SEB seb=new SEB();
        //System.out.println(seb.getRateOfInterest());

        Swedbank swedbank = new Swedbank();
        System.out.println(swedbank.getRateOfInterest());
        swedbank.deposit();

        Bank bank = new Swedbank();
        System.out.println(bank.getRateOfInterest());


    }
}
