package vs.test.concurrent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

public class TestSingleThreadExecutorCallable {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<String> names = asList("vishal", "rajat", "dahiya", "nishant", "prashant"); 
        
        for (int i = 0; i < 5; i++) {
            Future<String> submit = executorService.submit(new CallableWork(names.get(i)));
            try {
                System.out.println(submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        
        executorService.shutdown();;
        while (!executorService.isTerminated()) {
            
        }

        System.out.println("everyone has left the building!!!");
    }
}

class CallableWork implements Callable<String> {

    private String name;

    public CallableWork(String name) {
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
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}