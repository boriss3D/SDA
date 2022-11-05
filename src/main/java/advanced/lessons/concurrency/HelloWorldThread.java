package advanced.lessons.concurrency;


public class HelloWorldThread extends Thread {
    @Override
    public void run() {
        try {
            //if waits for sth from HelloWorldRunnableThread
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world from another thread");
        System.out.println(Thread.currentThread().getId());
    }
}
