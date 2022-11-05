package fundamentals.tasks02;

/*
Write a Java program to find the number of even and odd integers in a given array of integers: [1, 7, 3, 10, 9]
Output: Odd=4; Even=1
 */
public class Task36 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int odd = 0;
        int even = 0;
        for (int i : ints) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Output: Odd=" + odd + "; Even=" + even);
    }
}
