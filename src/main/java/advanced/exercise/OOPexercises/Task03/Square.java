package advanced.exercise.OOPexercises.Task03;

public class Square extends Rectangle {

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
    public String toString() {
        return "Square with side = " + this.getWidth() + ", which is a subclass of " +
                super.toString();
    }
}
