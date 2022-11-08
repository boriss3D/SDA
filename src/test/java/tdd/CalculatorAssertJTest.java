package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.tdd.Calculator;

public class CalculatorAssertJTest {
    private Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    /*
    5 + 3 = 8;
     */
    @Test
    void testShouldAddTwoNumbers() {
        // given
        double first = 5;
        double second = 3;
        // when
        double result = calculator.add(first, second);
        // then
        Assertions.assertThat(result).isEqualTo(8);
        Assertions.assertThat(calculator).isNotNull();
    }

    /*
    2 - 6 = -4;
     */
    @Test
    void testShouldSubtractTwoNumbers() {
        // given
        double first = 2;
        double second = 6;
        // when
        double result = calculator.subtract(first, second);
        // then
        Assertions.assertThat(result).isEqualTo(-4);
        Assertions.assertThat(calculator).isNotNull();
    }

    /*
    2.9 * 7.4 = 21.46;
     */
    @Test
    void testShouldMultiplyTwoNumbers() {
        // given
        double first = 2.9;
        double second = 7.4;
        // when
        double result = calculator.multiply(first, second);
        // then
        Assertions.assertThat(result).isEqualTo(21.46);
        Assertions.assertThat(calculator).isNotNull();
    }

    /*
    8.4 / 4.2 = 2;
     */
    @Test
    void testShouldDivideTwoNumbers() {
        // given
        double first = 8.4;
        double second = 4.2;
        // when
        double result = calculator.divide(first, second);
        // then
        Assertions.assertThat(result).isEqualTo(2);
        Assertions.assertThat(calculator).isNotNull();
    }
}
