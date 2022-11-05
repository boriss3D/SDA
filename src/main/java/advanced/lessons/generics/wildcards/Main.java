package advanced.lessons.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4, 5, 6, 7);

        List<Long> longList = Arrays.asList(1l, 2l, 3l, 4l);

        List<Double> doubleList = Arrays.asList(1d, 4d, 5d, 6d);

        System.out.println(sumOfNumber(integerList));

        System.out.println(sumOfNumber(longList));

        System.out.println(sumOfNumber(doubleList));


    }

    private static double sumOfNumber(List<? extends Number> list) {

        double sum = 0;

        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;

    }


}
