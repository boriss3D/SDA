package advanced.lessons.concurrency;

import java.util.concurrent.Callable;

public class HelloWorldCallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable started!";
    }
}
