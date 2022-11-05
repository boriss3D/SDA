package fundamentals.tasks02;

/*
Write a Java program to find the maximum and minimum value of an array: [1, 7, 3, 10, 9]
Output: Min=1; Max=10
 */
public class Task34 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : ints) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Output: Min=" + min + "; Max=" + max);
    }
}
