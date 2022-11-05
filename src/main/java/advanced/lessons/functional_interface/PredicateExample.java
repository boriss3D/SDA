package advanced.lessons.functional_interface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isBiggerThenZero = (value) -> value > 0;

        checkTest(isBiggerThenZero);
    }

    static void checkTest(Predicate<Integer> predicate) {

        System.out.println(predicate.test(-1));

    }


}
