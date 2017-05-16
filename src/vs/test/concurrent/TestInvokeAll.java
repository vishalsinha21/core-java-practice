package vs.test.concurrent;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

public class TestInvokeAll {

    public static void main(String[] args) {
        List<Callable<String>> callables = asList(
                new SmallTask("vishal"),
                new SmallTask("rajat"),
                new SmallTask("nishant"));
        
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        try {
            List<Future<String>> futures = executorService.invokeAll(callables);
            futures.forEach(f -> print(f));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            
        }

        System.out.println("everyone has left the building");
    }

    private static void print(Future<String> f) {
        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


}


class SmallTask implements Callable<String> {

    private String name;

    public SmallTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(name + " enters the building");
        process();
        System.out.println(name + " has left the building");
        return "bye " + name;
    }

    private void process() {
        try {
            int timeout = new Random().nextInt(100) * 100;
            System.out.println(name + " waits for " + timeout + "ms");
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
       