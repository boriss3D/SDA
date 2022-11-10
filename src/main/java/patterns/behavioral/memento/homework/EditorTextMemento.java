package patterns.behavioral.memento.homework;

import lombok.Getter;

@Getter
public class EditorTextMemento {
    private final String value;

    public EditorTextMemento(EditorText editorText) {
        this.value = editorText.getValue();
    }
}
