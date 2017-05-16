package vs.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//only single thread will run using single thread executor
public class TestSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Single(String.valueOf(i)));
        }
        
        executorService.shutdown();
        while(!executorService.isTerminated()) {
        }

        System.out.println("process ends");
        
    }
    
}

class Single implements Runnable {

    private String name;

    public Single(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " starts");
        process();
        System.out.println(name + " ends");
    }

    private void process() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
