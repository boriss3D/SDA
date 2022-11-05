package advanced.exercise.OOPexercises.Task04;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }
}
