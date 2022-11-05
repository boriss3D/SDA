package fundamentals.tasks02;

/*
Write a Java program to sum values of an array: [1, 7, 3, 10, 9]
Output: 30
 */
public class Task31 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        System.out.println("Output: " + sum);
    }
}
