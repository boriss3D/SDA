package advanced.lessons.concurrency;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws Exception {
        //HttpAction httpAction = new HttpAction();
        //httpAction.run();

        //new HelloWorldThread().start();

        //System.out.println(Thread.currentThread().getId());


        //new Thread(new HelloWorldRunnableThread()).start();

        //System.out.println("Start at =>" + LocalDateTime.now());
        // assume that we need to process 10 records
        /*for (int i = 0; i < 5; i++) {
            //processRecord(i);
            new Thread(() -> {
                try {
                    // we assume that our process takes 1 second
                    processRecord(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
*/
        new Thread(new HelloWorldRunnableThread()).start();

        HelloWorldCallableThread callableThread = new HelloWorldCallableThread();
        System.out.println(callableThread.call());

        System.out.println("Finished at =>" + LocalDateTime.now());


    }

    private static void processRecord(int i) throws InterruptedException {
        // assume that we call web service to process our record and it takes 1 second
        Thread.sleep(1000);
        System.out.println("Record " + i + " is processed at " + LocalDateTime.now());
    }

    public boolean hasCustomerEnoughMoney(int amount) {

        int currentBalance = 100; // select customer balance from db and assign it to current balance

        if (amount <= currentBalance) {
            return true;
        }

        return false;
    }


}
