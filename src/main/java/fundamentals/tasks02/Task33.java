package fundamentals.tasks02;

/*
Write a Java program to print all odd numbers from an array: [1, 7, 3, 10, 9]
Output: 1, 7, 3, 9
 */
public class Task33 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        System.out.print("Output: ");
        for (int i : ints) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
