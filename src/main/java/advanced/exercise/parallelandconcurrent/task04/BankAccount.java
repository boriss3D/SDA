package advanced.exercise.parallelandconcurrent.task04;

public class BankAccount {
    private int amount = 0;

    public synchronized void addMoney(int amount) {
        this.amount += amount;
        System.out.println(amount + " added to bank account");
        notify();
    }

    public synchronized void withdrawMoney(int amount) {
        while (this.amount < amount) {
            System.out.println("Trying to withdraw...");
            System.out.println("Not enough money!");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.amount -= amount;
        System.out.println(amount + " withdraw from bank account");
    }
}
