package fundamentals.tasks03;

public class Solution17 {
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if(i == j) {
                    ints[i][j] = i;
                }
            }
        }
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
