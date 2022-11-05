package fundamentals.tasks01;

/*
Write a Java program to sum values of an array: [1, 7, 3, 10, 9], average and min/max value
Output: 30
 */
public class Task31 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int sum = 0;
        double average;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : ints) {
            sum += i;

            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }

        average = 1.0 * sum / ints.length;

        System.out.println("Sum of array's integer is: " + sum);
        System.out.println("Average of array's integer is: " + average);
        System.out.println("Min value: " + min + ", Max value: " + max);
    }
}
