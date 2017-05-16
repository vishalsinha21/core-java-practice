package vs.test.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future> results = new ArrayList<Future>();


        for (int i = 0; i < 10; i++) {
            Future<String> result = executorService.submit(new MyCallable(new Random().nextInt(1000)));
            System.out.println("submitted " + i);
            results.add(result);
        }


        try {
            for (int i = 0; i < results.size(); i++) {
                Future future = results.get(i);
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        
        executorService.shutdown();
    }

}


class MyCallable implements Callable<String> {

    int sleepTime = 0;

    public MyCallable(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(sleepTime);
        return Thread.currentThread().getName();
    }

}