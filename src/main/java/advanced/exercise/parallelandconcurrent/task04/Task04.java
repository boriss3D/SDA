package advanced.exercise.parallelandconcurrent.task04;

public class Task04 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        new Thread(() -> bankAccount.withdrawMoney(500)).start();
        new Thread(() -> bankAccount.addMoney(100)).start();
        new Thread(() -> bankAccount.addMoney(100)).start();
        new Thread(() -> bankAccount.addMoney(100)).start();
        new Thread(() -> bankAccount.addMoney(100)).start();
        new Thread(() -> bankAccount.addMoney(100)).start();
    }
}
