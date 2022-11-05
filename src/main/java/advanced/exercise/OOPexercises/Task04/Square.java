package advanced.exercise.OOPexercises.Task04;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double side, double side02 ) {
        super(color, isFilled, side, side02);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public String toString() {
        return "Square with side = " + this.getWidth() + ", which is a subclass of " +
                super.toString();
    }
}
