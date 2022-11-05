package advanced.exercise.Collections.Task01;

public class SDAArrayList<T> {

    private Object[] objects;
    private int filled = 0;

    public SDAArrayList() {
        this.objects = new Object[5];
    }

    void add(T value){
        if (filled >= objects.length) {
            System.out.println("SDAArrayList is full");
            System.out.println("Adding additional capacity...");
            Object[] temp = new Object[objects.length * 2];
            System.arraycopy(objects, 0, temp, 0, objects.length);
            objects = temp;
        }
        objects[filled] = value;
        System.out.println(value + " added.");
        filled++;
    }

    void remove(T value){
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] == null) {
                continue;
            }
            if(objects[i].equals(value)) {
                objects[i] = null;
                System.out.println(value + " with index " + i + " was removed");
                return;
            }
        }
        System.out.println("No such value in the SDAArrayList");
    }

    @SuppressWarnings("unchecked")
    T get(int index) {
        if(index < 0 || index >= objects.length) {
            throw new IndexOutOfBoundsException();
        } else {
            return (T) objects[index];
        }
    }

    void display() {
        for ( Object t : objects) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
