package advanced.exercise.Collections.Task03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        int[] ints = main.buildArray();
        Arrays.sort(ints);

        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : main.getUnique(ints)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : main.getDuplicates(ints)) {
            System.out.print(i + " ");
        }
    }

    private int[] buildArray() {
        int[] ints = new int[100];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(51);
        }
        return ints;
    }

    private Set<Integer> getUnique(int[] temp) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : temp) {
            arrayList.add(i);
        }
        return new HashSet<>(arrayList);
    }

    private Set<Integer> getDuplicates(int[] temp) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i : temp) {
            if (arrayList.contains(i)) {
                duplicates.add(i);
            } else {
                arrayList.add(i);
            }
        }
        return duplicates;
    }
}
