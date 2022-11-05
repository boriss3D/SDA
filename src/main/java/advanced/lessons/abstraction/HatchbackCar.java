package advanced.lessons.abstraction;

public class HatchbackCar extends ElectricCar {

    public HatchbackCar(String vin) {
        super(vin);
    }

    @Override
    void runEngine() {
        System.out.println("hatchback car is started");
    }
}
