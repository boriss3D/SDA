package patterns.exercises.task09;

public class Main {
    public static void main(String[] args) {

        EditorTextMementoManager editorTextMementoManager = new EditorTextMementoManager();
        EditorText editorText = new EditorText();

        editorText.setValue("Text01");
        System.out.println("TextEditor current value - > " + editorText.getValue());
        editorTextMementoManager.save(new EditorTextMemento(editorText));
        System.out.println("Saved to Manager\n");

        editorText.setValue("Text02");
        System.out.println("TextEditor current value - > " + editorText.getValue());
        editorTextMementoManager.save(new EditorTextMemento(editorText));
        System.out.println("Saved to Manager\n");

        editorText.setValue("Text03");
        System.out.println("TextEditor current value - > " + editorText.getValue());
        System.out.println("Not saved...\n");

        System.out.println("Restoring previous value...");
        editorText.restoreFromMemento(editorTextMementoManager.restore());
        System.out.println("TextEditor current value - > " + editorText.getValue());

        System.out.println("Restoring previous value...");
        editorText.restoreFromMemento(editorTextMementoManager.restore());
        System.out.println("TextEditor current value - > " + editorText.getValue());
    }
}
