package fundamentals.tasks02;

/*
Write a Java program to print the area and perimeter of a circle: radius = 7.5 Output:
Area = 176.71458676442586; Perimeter = 47.12388980384689
 */
public class Task15 {
    public static void main(String[] args) {
        double radius = 7.5;
        double area = Math.PI * Math.pow(radius, 2.0);
        double perimeter = 2.0 * Math.PI * radius;
        System.out.println("Area = " + area + "; Perimeter = " + perimeter);
    }
}
