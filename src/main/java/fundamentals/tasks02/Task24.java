package fundamentals.tasks02;

/*
Write a Java program to print numbers between 1 and 100 which are divisible by 3, 5 and both
Divided by 3 - 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81,
84, 87, 90, 93, 96, 99
Divided by 5 - 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95
Divided by 3 & 5 - 15, 30, 45, 60, 75, 90
 */
public class Task24 {
    public static void main(String[] args) {
        System.out.print("Divided by 3 - ");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                if (i != 99) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nDivided by 5 - ");
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.print(i);
                if (i != 100) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nDivided by 3 & 5 - ");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i);
                if (i != 90) {
                    System.out.print(", ");
                }
            }
        }
    }
}
