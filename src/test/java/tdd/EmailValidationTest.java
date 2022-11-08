package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.tdd.EmailValidation;

public class EmailValidationTest {
    private EmailValidation emailValidation;
    @BeforeEach
    void beforeEach() {
        emailValidation = new EmailValidation();
    }
    /*
    boriss.harin@gmail.com
     */
    @Test
    void emailCheck01True () {
        // given
        String email = "boriss.harin@gmail.com";
        // when
        boolean result = emailValidation.emailValidation(email);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).isTrue();
    }
    /*
    boriss.harin.gmail.com
     */
    @Test
    void emailCheck02False () {
        // given
        String email = "boriss.harin.gmail.com";
        // when
        boolean result = emailValidation.emailValidation(email);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).isFalse();
    }
    /*
    boriss.harin@gmail
     */
    @Test
    void emailCheck03False () {
        // given
        String email = "boriss.harin@gmail";
        // when
        boolean result = emailValidation.emailValidation(email);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).isFalse();
    }
    /*
    borissharin@gmail.ee
    */
    @Test
    void emailCheck04True () {
        // given
        String email = "borissharin@gmail.ee";
        // when
        boolean result = emailValidation.emailValidation(email);
        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).isTrue();
    }
}
