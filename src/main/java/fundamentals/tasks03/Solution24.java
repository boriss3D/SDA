package fundamentals.tasks03;

public class Solution24 {
    int sum(int... number) {
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();

        System.out.println(solution24.sum(1));
        System.out.println(solution24.sum(1, 2));
        System.out.println(solution24.sum(1, 2, 3));
        System.out.println(solution24.sum(1, 2, 3, 4));
    }
}
