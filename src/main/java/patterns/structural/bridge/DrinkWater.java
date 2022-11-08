package patterns.structural.bridge;

public class DrinkWater implements DrinkPurchase{

    @Override
    public Drink buy(Double cost) {
        return new Water();
    }
}
