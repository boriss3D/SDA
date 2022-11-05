package patterns.structural.decorator;

public class CarDecorator implements Car {

    Car car;
    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void createCar() {
        car.createCar();
        System.out.println(" with Gold");
    }
}
