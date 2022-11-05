package fundamentals.tasks01;

/*
Print 1 3 5
Print 5 3 1
 */
public class Task22 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 5; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
