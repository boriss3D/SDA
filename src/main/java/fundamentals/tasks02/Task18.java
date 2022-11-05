package fundamentals.tasks02;

/*
Write a Java program to swap two variables: a = 5; b = 13 Output: a = 13; b = 5;
 */
public class Task18 {
    public static void main(String[] args) {
        int a = 5;
        int b = 13;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + "; b = " + b);
    }
}
