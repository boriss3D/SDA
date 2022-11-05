package advanced.exercise.Generics.Task01;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setItem01(100);
        pair.setItem02("One hundred");

        System.out.println(pair);
    }
}
