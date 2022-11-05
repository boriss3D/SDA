package testing.tdd;

public class Account {
    private final String accountNumber;
    private final String nameOfTheOwner;
    private int balance;

    public Account(int balance, String accountNumber, String nameOfTheOwner) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.nameOfTheOwner = nameOfTheOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getNameOfTheOwner() {
        return nameOfTheOwner;
    }

    public void transferFromBankAccount(Account account, int amount) {
        System.out.println(this.nameOfTheOwner + " : " + this.balance + " ; " + account.getNameOfTheOwner() +
                " : " + account.balance);
        this.balance -= amount;
        account.balance += amount;
        System.out.println("Money transfer of " + amount + " Euro from " + this.accountNumber + " of " + this.nameOfTheOwner + " to " +
                account.accountNumber + " of " + account.nameOfTheOwner);
        System.out.println(this.nameOfTheOwner + " : " + this.balance + " ; " + account.getNameOfTheOwner() +
                " : " + account.balance);
    }

    public void transferToBankAccount(Account account, int amount) {
        System.out.println(this.nameOfTheOwner + " : " + this.balance + " ; " + account.getNameOfTheOwner() +
                " : " + account.balance);
        this.balance += amount;
        account.balance -= amount;
        System.out.println("Money transfer of " + amount + " Euro from " + account.accountNumber + " of " + account.nameOfTheOwner + " to " +
                this.accountNumber + " of " + this.nameOfTheOwner);
        System.out.println(this.nameOfTheOwner + " : " + this.balance + " ; " + account.getNameOfTheOwner() +
                " : " + account.balance);
    }
}
