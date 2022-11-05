package patterns.creational.factory;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("triangle demo");
    }

    @Override
    public int calculateArea() {
        return 4;
    }
}
