package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that implements a simple calculator. The application should:
a. read first number (type float)
b. read one of following symbols: + - / *
c. read second number (type float)
d. return a result of given mathematical operation
If the user provides a symbol other than supported, the application should print "Invalid symbol". If the entered action
cannot be implemented (i.e. it is inconsistent with the principles of mathematics), the application should print
"Cannot calculate".

 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Please enter operation symbol(+ - / *): ");
        String symbol = scanner.next();
        System.out.print("Please enter second number: ");
        float secondNumber = scanner.nextFloat();

        if ("+".equals(symbol)) {
            System.out.println(addition(firstNumber, secondNumber));
        } else if ("-".equals(symbol)) {
            System.out.println(subtraction(firstNumber, secondNumber));
        } else if ("/".equals(symbol)) {
            if (Float.compare(0.0F, secondNumber) != 0) {
                System.out.println(division(firstNumber, secondNumber));
            } else {
                System.out.println("Cannot calculate");
            }
        } else if ("*".equals(symbol)) {
            System.out.println(multiplication(firstNumber, secondNumber));
        } else {
            System.out.println("Invalid symbol");
        }
    }

    static float addition(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    static float subtraction(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    static float division(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }

    static float multiplication(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
}