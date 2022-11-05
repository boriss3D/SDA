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
public class Task08a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Please enter operation symbol(+ - / *): ");
        String symbol = scanner.next();
        System.out.print("Please enter second number: ");
        float secondNumber = scanner.nextFloat();

        switch (symbol) {
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "/" -> {
                if (Float.compare(0.0F, secondNumber) != 0) {
                    System.out.println(firstNumber / secondNumber);
                } else {
                    System.out.println("Cannot calculate");
                }
            }
            case "*" -> System.out.println(firstNumber * secondNumber);
            default -> System.out.println("Invalid symbol");
        }
    }
}
