package advanced.lessons.abstraction;

public class GasolineCar extends Car {

    public GasolineCar(String vin) {
        super(vin);
    }

    @Override
    void runEngine() {
        System.out.println("Gasoline engine is started!");
    }
}
