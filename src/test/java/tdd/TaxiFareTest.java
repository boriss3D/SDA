package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.tdd.TaxiFare;

/*
The test scenarios are:
- Kati's ride lasted 20 kilometers and the fare was 20.00;
- Agu's ride lasted 5 kilometers and the fare was 6.00;
- Trinu's ride lasted 10 kilometers and the fare was 11.00;
- Ott's ride lasted 8 kilometers and the fare was 8.40.
 */
public class TaxiFareTest {
    private TaxiFare taxiFare;
    @BeforeEach
    void beforeEach() {
        taxiFare = new TaxiFare();
    }

    @Test
    void test20kilometerRideCosts20Euros () {
        // given
        int kilometers = 20;
        // when
        double result = taxiFare.calculateFare(kilometers);
        // then
        Assertions.assertThat(result).isEqualTo(20.00);
    }

    @Test
    void test5kilometerRideCosts6Euros () {
        // given
        int kilometers = 5;
        // when
        double result = taxiFare.calculateFare(kilometers);
        // then
        Assertions.assertThat(result).isEqualTo(6.00);
    }

    @Test
    void test10kilometerRideCosts11Euros () {
        // given
        int kilometers = 10;
        // when
        double result = taxiFare.calculateFare(kilometers);
        // then
        Assertions.assertThat(result).isEqualTo(10.00);
    }

    @Test
    void test8kilometerRideCosts8Euros40Scents() {
        // given
        int kilometers = 8;
        // when
        double result = taxiFare.calculateFare(kilometers);
        // then
        Assertions.assertThat(result).isEqualTo(8.40);
    }
}
