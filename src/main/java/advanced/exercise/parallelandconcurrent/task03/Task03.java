package advanced.exercise.parallelandconcurrent.task03;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int[] ints = new int[50000];
        int[] intCopy = new int[50000];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt();
        }

        System.arraycopy(ints, 0, intCopy, 0, ints.length);

        new Thread(() -> BubbleAlgorithm.sort(ints)).start();
        new Thread(() -> SelectionSortAlgorithm.insertionSort(intCopy)).start();
    }
}