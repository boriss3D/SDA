package patterns.structural.decorator;

public class MiniCar implements Car{

    @Override
    public void createCar() {
        System.out.println("This is Racing Car");
    }
}
