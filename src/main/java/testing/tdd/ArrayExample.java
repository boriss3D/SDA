package testing.tdd;

import java.util.Arrays;
import java.util.HashSet;

/*
Method should return new array without duplicates.
 */
public class ArrayExample {
    public static String[] removeDuplicates(String[] array) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
        return hashSet.toArray(new String[0]);
    }
}
