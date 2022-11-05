package advanced.lessons.abstraction;

public class ElectricCar extends Car {


    public ElectricCar(String vin) {
        super(vin);
    }

    @Override
    void runEngine() {
        System.out.println("Electric car engine is started!");
    }
}
