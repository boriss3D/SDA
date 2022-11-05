package fundamentals.tasks01;

import java.util.Arrays;
import java.util.Scanner;

/*
Let's create an array of 5 numbers, sort it, and print it out with annotation if they are even or not
Let's check if color provided by the user is a part of estonia flag
 */
public class Task26 {
    public static void main(String[] args) {
        //#1
        int[] ints = {1, 3, 52, 8, 99};
        Arrays.sort(ints);
        for (int anInt : ints) {
            if (anInt % 2 == 0) {
                System.out.println(anInt + " is even");
            } else {
                System.out.println(anInt + " is odd");
            }
        }
        //#2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the color: ");
        String userInput = scanner.nextLine();
        String[] strings = new String[3];
        strings[0] = "blue";
        strings[1] = "white";
        strings[2] = "black";
        int hits = 0;
        for (String string : strings) {
            if (string.equalsIgnoreCase(userInput)) {
                System.out.println(string + " is one of the color of the estonian flag");
                hits++;
                break;
            }
        }
        if (hits == 0) {
            System.out.println(userInput + " is not one of the color of the estonian flag");
        }
    }
}