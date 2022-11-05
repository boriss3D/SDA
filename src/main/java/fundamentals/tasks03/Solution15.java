package fundamentals.tasks03;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        String[] strings = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (String name : strings) {
            System.out.println("Hello " + name);
        }
    }
}
