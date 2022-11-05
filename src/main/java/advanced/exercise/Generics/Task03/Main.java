package advanced.exercise.Generics.Task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four"};
        System.out.println(Arrays.toString(strings));
        swap(strings, 0, 3);
        System.out.println((Arrays.toString(strings)));
    }

    public static <T> void swap(T[] arr, int posOne, int posTwo) {
        T posOneValue = arr[posOne];
        T posTwoValue = arr[posTwo];
        arr[posOne] = posTwoValue;
        arr[posTwo] = posOneValue;
    }
}
