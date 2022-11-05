package advanced.lessons.generics;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new Coffee("Americano");

        Cup<Coffee> myLovelyCup = new Cup<>(coffee);
        //myLovelyCup.drink();

        Water water = new Water("Still");
        Cup<Water> myLovelyWaterCup = new Cup<>(water);
        //myLovelyWaterCup.drink();


        Cup<Liquid> myCup = new Cup<>();
        myCup.fulfillCup(water);
        myCup.drink();

        myCup.fulfillCup(coffee);
        myCup.drink();


    }

}
