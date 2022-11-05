package fundamentals.tasks01;

/*
Write a Java program to find the number of even and odd integers in a given array of integers: [1, 7, 3, 10, 9]
Output: Odd=4; Even=1
 */
public class Task35 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int evenCount = 0;
        int oddCount = 0;

        for (int i : ints) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Odd=" + oddCount + " Even=" + evenCount);
    }
}
