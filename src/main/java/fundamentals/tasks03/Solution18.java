package fundamentals.tasks03;

public class Solution18 {
    public static void main(String[] args) {
        int[][] ints = new int[2][3];
        int value = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = value;
                value ++;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print("tab[" + i + "," + j + "] = " + ints[i][j] + "; ");
            }
            System.out.println();
        }
    }
}
