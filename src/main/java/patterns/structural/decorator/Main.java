package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new RacingCar();
        car.createCar();
        System.out.println();
        Car decorated = new CarDecorator(car);
        decorated.createCar();
    }
}
