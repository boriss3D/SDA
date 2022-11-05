package advanced.exercise.Generics.Task01;

public class Pair<S, U> {
    private S item01;
    private U item02;

    public void setItem01(S item01) {
        this.item01 = item01;
    }

    public void setItem02(U item02) {
        this.item02 = item02;
    }

    @Override
    public String toString() {
        return "Pair " + item01 + " <-> " + item02;
    }
}
