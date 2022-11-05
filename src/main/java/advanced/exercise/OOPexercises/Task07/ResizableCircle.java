package advanced.exercise.OOPexercises.Task07;

public class ResizableCircle implements Resizable {
    private int radios;

    public ResizableCircle(int radios) {
        this.radios = radios;
    }

    @Override
    public void resize(int percent) {
        this.radios *= percent / 100.0;
    }

    public int getRadios() {
        return radios;
    }
}
