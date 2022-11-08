package loan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.loan.Account;
import testing.loan.HomeLoanService;
import testing.loan.LoanApplication;

public class HomeLoanServiceTest {

    private HomeLoanService homeLoanService;

    @BeforeEach
    void beforeEach() {
        homeLoanService = new HomeLoanService();
    }

    @Test
    void testLowerPropertyPriceWithBalance() {
        // given
        Account account = new Account("12345", "Client1", 21_000.00);
        double propertyPrice = 140_000.00;
        // when
        LoanApplication loanApplication = homeLoanService.applyForHomeLoan(account, propertyPrice);
        // then
        Assertions.assertThat(loanApplication).isNotNull();
        Assertions.assertThat(loanApplication.account()).isEqualTo(account);
        Assertions.assertThat(loanApplication.propertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(loanApplication.granted()).isTrue();
    }

    @Test
    void testLowerPropertyPriceWithNoBalance() {
        // given
        Account account = new Account("12345", "Client1", 18_749.00);
        double propertyPrice = 125_000.00;
        // when
        LoanApplication loanApplication = homeLoanService.applyForHomeLoan(account, propertyPrice);
        // then
        Assertions.assertThat(loanApplication).isNotNull();
        Assertions.assertThat(loanApplication.account()).isEqualTo(account);
        Assertions.assertThat(loanApplication.propertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(loanApplication.granted()).isFalse();
    }

    @Test
    void testHigherPropertyPriceWithBalance() {
        // given
        Account account = new Account("12345", "Client1", 30_000.00);
        double propertyPrice = 150_000.00;
        // when
        LoanApplication loanApplication = homeLoanService.applyForHomeLoan(account, propertyPrice);
        // then
        Assertions.assertThat(loanApplication).isNotNull();
        Assertions.assertThat(loanApplication.account()).isEqualTo(account);
        Assertions.assertThat(loanApplication.propertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(loanApplication.granted()).isTrue();
    }

    @Test
    void testHigherPropertyPriceWithNoBalance() {
        // given
        Account account = new Account("12345", "Client1", 25_000.00);
        double propertyPrice = 200_000.00;
        // when
        LoanApplication loanApplication = homeLoanService.applyForHomeLoan(account, propertyPrice);
        // then
        Assertions.assertThat(loanApplication).isNotNull();
        Assertions.assertThat(loanApplication.account()).isEqualTo(account);
        Assertions.assertThat(loanApplication.propertyPrice()).isEqualTo(propertyPrice);
        Assertions.assertThat(loanApplication.granted()).isFalse();
    }
}
