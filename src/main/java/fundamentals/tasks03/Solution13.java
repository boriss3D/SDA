package fundamentals.tasks03;

public class Solution13 {
    public static void main(String[] args) {
        int sum = 0;
        int steps = 0;
        for (int i = 5; i < 460 * 2 + 1; i += 2) {
            steps++;
            sum += i;
        }
        System.out.println(steps);
        System.out.println(sum);
    }
}
