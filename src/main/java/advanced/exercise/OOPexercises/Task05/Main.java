package advanced.exercise.OOPexercises.Task05;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(0.0f, 0.0f, 3.0f, 4.0f);
        System.out.printf("Line length -> %.2f", line.getLineLength());
        System.out.println();
        System.out.printf("Center of the line -> x = %.2f, y = %.2f", line.getCenterOfLine().getX(),
                line.getCenterOfLine().getY());
    }
}