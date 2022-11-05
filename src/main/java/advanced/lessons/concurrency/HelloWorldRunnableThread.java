package advanced.lessons.concurrency;

public class HelloWorldRunnableThread implements Runnable {

    @Override
    public void run() {
        //if waits for sth from HelloWorldThread
        System.out.println("HelloWorldThread started!");
    }

}
