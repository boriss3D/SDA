package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.tdd.CollatzSequence;

import java.util.ArrayList;

public class CollatzSequenceTest {

    private CollatzSequence collatzSequence;

    @BeforeEach
    void beforeEach() {
        collatzSequence = new CollatzSequence();
    }
    /*
    - Given the number 13, the sequence is: 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
     */
    @Test
    void CollatzSequenceFor13() {
        // give
        int n = 13;
        // when
        ArrayList<Integer> result = collatzSequence.getCollatzSequence(n);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).containsExactly(13, 40, 20, 10, 5, 16, 8, 4, 2, 1);
    }
    /*
    - Given the number 25, the sequence is: 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5,
    16, 8, 4, 2, 1;
     */
    @Test
    void CollatzSequenceFor25 () {
        // give
        int n = 25;
        // when
        ArrayList<Integer> result = collatzSequence.getCollatzSequence(n);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).containsExactly(25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26,
                13, 40, 20, 10, 5, 16, 8, 4, 2, 1);
    }
    /*
    - Given the number 9, the sequence is: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
     */
    @Test
    void CollatzSequenceFor9 () {
        // give
        int n = 9;
        // when
        ArrayList<Integer> result = collatzSequence.getCollatzSequence(n);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).containsExactly(9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5,
                16, 8, 4, 2, 1);
    }
}
