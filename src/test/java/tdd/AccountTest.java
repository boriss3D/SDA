package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.tdd.Account;

public class AccountTest {
    /*
    Check the correctness of the account number (26 digits)
    Balance for the account after sending / receiving the transfer
    All the fields in the transfer have been completed
     */
    @Test
    void moneyTransferFromTo() {
        // given
        Account accountJohn = new Account(10_000, "12345612345678912345678912",
                "John Smith");
        Account accountJane = new Account(15_000, "12345698765432198765432198",
                "Jane Smith");
        int amount = 1_000;
        // when
        accountJohn.transferFromBankAccount(accountJane, amount);
        // then
        Assertions.assertThat(accountJohn.getBalance()).isNotNull();
        Assertions.assertThat(accountJohn.getAccountNumber()).isNotNull();
        Assertions.assertThat(accountJohn.getNameOfTheOwner()).isNotNull();
        Assertions.assertThat(accountJane.getBalance()).isNotNull();
        Assertions.assertThat(accountJane.getAccountNumber()).isNotNull();
        Assertions.assertThat(accountJane.getNameOfTheOwner()).isNotNull();
        Assertions.assertThat(accountJohn.getBalance()).isGreaterThanOrEqualTo(amount);
        Assertions.assertThat(accountJohn.getAccountNumber().length()).isEqualTo(26);
        Assertions.assertThat(accountJane.getAccountNumber().length()).isEqualTo(26);
        Assertions.assertThat(accountJohn.getBalance()).isEqualTo(9_000);
        Assertions.assertThat(accountJane.getBalance()).isEqualTo(16_000);
    }
    @Test
    void moneyTransferToFrom() {
        // given
        Account accountJohn = new Account(10_000, "12345612345678912345678912",
                "John Smith");
        Account accountJane = new Account(15_000, "12345698765432198765432198",
                "Jane Smith");
        int amount = 5_000;
        // when
        accountJohn.transferToBankAccount(accountJane, amount);
        // then
        Assertions.assertThat(accountJohn.getBalance()).isNotNull();
        Assertions.assertThat(accountJohn.getAccountNumber()).isNotNull();
        Assertions.assertThat(accountJohn.getNameOfTheOwner()).isNotNull();
        Assertions.assertThat(accountJane.getBalance()).isNotNull();
        Assertions.assertThat(accountJane.getAccountNumber()).isNotNull();
        Assertions.assertThat(accountJane.getNameOfTheOwner()).isNotNull();
        Assertions.assertThat(accountJohn.getBalance()).isGreaterThanOrEqualTo(amount);
        Assertions.assertThat(accountJohn.getAccountNumber().length()).isEqualTo(26);
        Assertions.assertThat(accountJane.getAccountNumber().length()).isEqualTo(26);
        Assertions.assertThat(accountJohn.getBalance()).isEqualTo(15_000);
        Assertions.assertThat(accountJane.getBalance()).isEqualTo(10_000);

    }
}
