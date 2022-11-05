package advanced.exercise.OOPexercises.Task04;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " +
                super.toString();
    }
}
