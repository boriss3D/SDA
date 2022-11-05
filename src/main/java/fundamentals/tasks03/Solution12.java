package fundamentals.tasks03;

public class Solution12 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if((101 - i) % 5 == 0) {
                System.out.println(101 - i);
            }
        }
    }
}
