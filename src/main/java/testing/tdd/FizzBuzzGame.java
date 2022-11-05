package testing.tdd;

/*
In this game we should print a sequence of numbers from 1 to `n`, where `n` is provided as a method parameter.

When printing the number we need to pay attention to some rules:
- Numbers divisible by 3 should appear as `Fizz` instead of number;
- Numbers divisible by 5 should appear as `Buzz` instead of number;
- Numbers divisible by 3 and 5 should appear as `FizzBuzz` instead of number.
 */
public class FizzBuzzGame {
    public String[] game(int n) {
        String[] strings = new String[n];

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strings[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                strings[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                strings[i - 1] = "Buzz";
            } else {
                strings[i - 1] = String.valueOf(i);
            }
        }
        return strings;
    }
}
