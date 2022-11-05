package advanced.exercise.Exceptions.Task01;

public class Main {

    public double divide(double a, double b) throws CannotDivideBy0Exception {
        if (b == 0) {
            throw new CannotDivideBy0Exception();
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) throws CannotDivideBy0Exception {
        Main main = new Main();
        System.out.println(main.divide(25.0, 5.0));
        System.out.println(main.divide(5.0, 0.0));
    }
}
