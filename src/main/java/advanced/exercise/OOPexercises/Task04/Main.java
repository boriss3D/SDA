package advanced.exercise.OOPexercises.Task04;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 10.0);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("Green", false, 15.0, 20.0);
        System.out.println(rectangle);
        Square square = new Square("Yellow", true, 5.0, 5.0);
        System.out.println(square);
    }
}
