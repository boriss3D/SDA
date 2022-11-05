package fundamentals.tasks02;

/*
Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number: [1, 2, 7, 3, 10, 2, 9] with sum 4
Output: 1-3; 2-2
 */
public class Task40 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;
        System.out.print("Output: ");
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] + ints[j] == sum && i != j) {
                    System.out.print(ints[i] + "-" + ints[j] + " ");
                }
            }
        }
    }
}
