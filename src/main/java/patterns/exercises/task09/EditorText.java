package patterns.exercises.task09;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditorText {
    private String value;

    public void restoreFromMemento(EditorTextMemento editorTextMemento) {
        this.value = editorTextMemento.getValue();
    }
}
