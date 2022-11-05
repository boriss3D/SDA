package advanced.exercise.Generics.Task04;

import java.util.ArrayList;

public class Library<T extends Media> {

    private final ArrayList<T> arrayList;

    public Library() {
        this.arrayList = new ArrayList<>();
    }

    public void addMedia(T t) {
        arrayList.add(t);
    }

    public void getAll() {
        for (T t : arrayList) {
            System.out.println(t);
        }
    }
}
