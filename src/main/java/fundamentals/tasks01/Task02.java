package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application calculating BMI (Body Mass Index) and checking if it's optimal or not. Your application should read
two variables: weight (in kilograms, type float) and height (in centimeters, type int). BMI should be calculated given
following formula: BMI = kg/m2
The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values. Your program should write
"BMI optimal" or "BMI not optimal", according to the assumptions above.
 */
public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your weight(kg): ");
        float kilograms = scanner.nextFloat();

        System.out.print("Please input your height(cm): ");
        int height = scanner.nextInt();

        scanner.close();

        double bmi = kilograms / Math.pow(height / 100.0, 2.0);

        if (Double.compare(bmi, 18.5) >= 0 && Double.compare(bmi, 24.9) <= 0) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}