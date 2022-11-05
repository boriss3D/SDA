package fundamentals.tasks03;

public class Solution22 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }

    static class Rectangle {
        final private int a;
        final private int b;

        Rectangle(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int getArea() {
            return a * b;
        }

        int getPerimeter() {
            return 2 * (a + b);
        }
    }
}
