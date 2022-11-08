package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.tdd.SumSquareDifference;

/*
The test scenarios are:
 */
public class SumSquareDifferenceTest {
    private SumSquareDifference sumSquareDifference;

    @BeforeEach
    void beforeEach() {
        sumSquareDifference = new SumSquareDifference();
    }

    /*
    - Given the number 10, the differences are `3025 - 385` and the final answer is `2640`;
     */
    @Test
    void differenceFor10() {
        // give
        int n = 10;
        // when
        int result = sumSquareDifference.getSumSquareDifference(n);
        // then
        Assertions.assertThat(sumSquareDifference).isNotNull();
        Assertions.assertThat(result).isEqualTo(2640);
    }

    /*
    - Given the number 20, the differences are `44100 - 2870` and the final answer is `41230`;
     */
    @Test
    void differenceFor20() {
        // give
        int n = 20;
        // when
        int result = sumSquareDifference.getSumSquareDifference(n);
        // then
        Assertions.assertThat(sumSquareDifference).isNotNull();
        Assertions.assertThat(result).isEqualTo(41230);
    }

    /*
    - Given the number 30, the differences are `216225 - 9455` and the final answer is `206770`.
     */
    @Test
    void differenceFor30() {
        // give
        int n = 30;
        // when
        int result = sumSquareDifference.getSumSquareDifference(n);
        // then
        Assertions.assertThat(sumSquareDifference).isNotNull();
        Assertions.assertThat(result).isEqualTo(206770);
    }
}
