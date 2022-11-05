package fundamentals.tasks02;

/*
Write a Java program to calculate the average value of array elements: [1, 7, 3, 10, 9]
Output: 6
 */
public class Task32 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        double sum = 0;
        for (int i : ints) {
            sum += i;
        }

        System.out.println("Output: " + sum / ints.length);
    }
}
