package testing.tdd;

import java.util.ArrayList;

/*
This sequence always starts with a given number `n`, provided as a method parameter.
Once you receive `n` you need to perform the following operations:
- If the number is even, divide it by two (n = n/2)
- If the number is odd, triple it and add one (n = 3n + 1)
These operations will be executed until `n` becomes 1.
 */
public class CollatzSequence {
    public ArrayList<Integer> getCollatzSequence(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (true) {
            arrayList.add(n);
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return arrayList;
    }
}
