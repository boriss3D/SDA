package advanced.lessons.concurrency;

public class HttpAction extends Thread {

    @Override
    public void run() {
        System.out.println("Http action is started!");
    }

}
