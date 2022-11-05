package advanced.exercise.Generics.Task02;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 44, 32, null, 100, 0};
        String[] strings = {"aaa", null, null};

        System.out.println(countIf(integers));
        System.out.println(countIf(strings));
    }

    static <T> int countIf(T[] arr) {
        int result = 0;

        for (T t : arr) {
            NotNull notNull = () -> t != null;
            if (notNull.moreThanZero()) {
                result++;
            }
        }
        return result;
    }
}
