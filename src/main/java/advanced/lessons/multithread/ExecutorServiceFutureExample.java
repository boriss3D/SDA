package advanced.lessons.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Started....");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> result = executorService.submit(() -> downloadHtmlPage());

        System.out.println("I continue to work on other tasks");

        String resultString = result.get();

        System.out.println("i waited here until the result future returns response");

        System.out.println(resultString);

        System.out.println("Ended....");

        executorService.shutdown();

    }

    private static String downloadHtmlPage() throws InterruptedException {
        //assume that we download an html content from a server
        Thread.sleep(2000);
        System.out.println("html content is ready to be returned");
        return "html content";
    }

}
