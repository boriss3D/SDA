package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to print the area and perimeter of a rectangle:
Width = 5.5; Height = 8.5 Output: Area = 47.60?; Perimeter = 28.20?
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input width: ");
        double width = scanner.nextDouble();
        System.out.print("Please enter height: ");
        double height = scanner.nextDouble();
        scanner.close();

        System.out.println("Width = " + width + "; Height = " + height + " Output: Area = " + width * height + "; Perimeter = " + (width + height) * 2.0);
    }
}

