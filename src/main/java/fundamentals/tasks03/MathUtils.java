package fundamentals.tasks03;

public class MathUtils {
    static int power(int a, int b) {
        return (int)Math.pow(a, b);
    }

    static long factorial(int a) {
        if(a < 0){
            return 0;
        }
        if(a == 0) {
            return 1;
        }
        long f = 1;
        for (int i = 2; i <= a; i++) {
            f *=i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Power of 5 in 3: " + power(5, 3));
        System.out.println("Fractal of 5: " + factorial(23));
    }
}
