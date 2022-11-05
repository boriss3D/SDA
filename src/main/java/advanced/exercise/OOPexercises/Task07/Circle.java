package advanced.exercise.OOPexercises.Task07;

public class Circle implements GeometricObject {
    private final int radios;

    public Circle(int radios) {
        this.radios = radios;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radios;
    }

    @Override
    public double getArea() {
        return Math.PI * radios * radios;
    }
}
