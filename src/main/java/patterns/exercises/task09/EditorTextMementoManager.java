package patterns.exercises.task09;

import java.util.ArrayDeque;

public class EditorTextMementoManager {
    private final ArrayDeque<EditorTextMemento> arrayDeque = new ArrayDeque<>();

    public void save(EditorTextMemento editorTextMemento) {
        arrayDeque.add(editorTextMemento);
    }

    public EditorTextMemento restore() {
        return arrayDeque.pollLast();
    }
}
