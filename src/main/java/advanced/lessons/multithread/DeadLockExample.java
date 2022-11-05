package advanced.lessons.multithread;

public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {
        final String account = "account";
        final String creditCard = "creditCard";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (account) {
                    System.out.println("Thread 1: Locked account");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {
                    }
                    System.out.println("Thread 1 will wait until credit card lock to be released");
                    synchronized (creditCard) {
                        System.out.println("Thread 1: Locked creditCard");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (creditCard) {
                    System.out.println("Thread 2: Locked credit card");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {
                    }
                    System.out.println("Thread 2 will wait until account lock to be release");
                    synchronized (account) {
                        System.out.println("Thread 2: Locked creditCard");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Exiting? No I will never reach this line of code because threads will NOT join");
    }

}
