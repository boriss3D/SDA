package advanced.lessons.generics.boriss;

public class Box<T> {
    private final T thing;

    public Box(T thing) {
        this.thing = thing;
    }

    public void put() {
        System.out.println("I've put " + thing + " to the box");
    }
}
