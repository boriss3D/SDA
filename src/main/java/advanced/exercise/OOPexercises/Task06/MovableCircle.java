package advanced.exercise.OOPexercises.Task06;

public class MovableCircle implements Movable{
    private final MovablePoint movablePoint;
    private final int radius;

    public MovableCircle(MovablePoint movablePoint, int radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    public int getRadius() {
        return radius;
    }
}
