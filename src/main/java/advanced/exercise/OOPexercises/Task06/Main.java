package advanced.exercise.OOPexercises.Task06;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 5, 5);
        System.out.printf("Movable Point was created with coordinates X -> %d, Y -> %d\n", movablePoint.getX(),
                movablePoint.getY());
        MovableCircle movableCircle = new MovableCircle(movablePoint, 10);
        System.out.printf("Movable Circle was created with radios -> %d\n", movableCircle.getRadius());

        movableCircle.moveUp();
        System.out.println("Move UP!");
        System.out.printf("Movable Circle coordinates are: X -> %d, Y -> %d\n", movablePoint.getX(), movablePoint.getY());
        movableCircle.moveRight();
        System.out.println("Move Right!");
        System.out.printf("Movable Circle coordinates are: X -> %d, Y -> %d\n", movablePoint.getX(), movablePoint.getY());
        movableCircle.moveDown();
        System.out.println("Move Down!");
        System.out.printf("Movable Circle coordinates are: X -> %d, Y -> %d\n", movablePoint.getX(), movablePoint.getY());
        movableCircle.moveLeft();
        System.out.println("Move Left!");
        System.out.printf("Movable Circle coordinates are: X -> %d, Y -> %d\n", movablePoint.getX(), movablePoint.getY());
    }
}
