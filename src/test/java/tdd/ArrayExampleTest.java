package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.tdd.ArrayExample;

public class ArrayExampleTest {
    /*
    "Boriss", "Amy", "Anna", "Boriss"
     */
    @Test
    void arrayExampleTest01 () {
        // given
        String[] array = {"Boriss", "Amy", "Anna", "Boriss"};
        // when
        String[] result = ArrayExample.removeDuplicates(array);
        // then
        Assertions.assertThat(result).containsExactly("Boriss", "Amy", "Anna");
    }
    /*
    "Boriss", "Boriss", "Boriss", "Amy", "Anna", "Boriss", "Amy"
    */
    @Test
    void arrayExampleTest02 () {
        // given
        String[] array = {"Boriss", "Boriss", "Boriss", "Amy", "Anna", "Boriss", "Amy"};
        // when
        String[] result = ArrayExample.removeDuplicates(array);
        // then
        Assertions.assertThat(result).containsExactly("Boriss", "Amy", "Anna");
    }
}
