package fundamentals.tasks02;

/*
Write a Java program to print the following:
    1
   222
  33333
 4444444
555555555
 */
public class Task27 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
