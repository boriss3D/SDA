package fundamentals.tasks02;

/*
Write a Java program that lists all even numbers from 1 to 100 Output: 2, 4, 6, 8, ...,100
 */
public class Task22 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i != 100) {
                    System.out.print(", ");
                }
            }
        }
    }
}
