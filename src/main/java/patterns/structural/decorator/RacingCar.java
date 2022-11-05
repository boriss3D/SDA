package patterns.structural.decorator;

public class RacingCar implements Car{

    @Override
    public void createCar() {
        System.out.print("This is Racing Car");
    }
}
