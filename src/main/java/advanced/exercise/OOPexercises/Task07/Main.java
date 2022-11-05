package advanced.exercise.OOPexercises.Task07;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.printf("Circle perimeter -> %.2f\n", circle.getPerimeter());
        System.out.printf("Circle area -> %.2f\n", circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(50);
        System.out.println("Radios -> " + resizableCircle.getRadios());
        resizableCircle.resize(50);
        System.out.println("Radios -> " + resizableCircle.getRadios());
    }
}
