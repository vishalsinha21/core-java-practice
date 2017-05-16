package vs.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import static vs.test.concurrent.ConcurrentUtils.sleep;
import static vs.test.concurrent.ConcurrentUtils.stop;

public class TestSemaphores {

    public static void main(String[] args) {
        TestSemaphores testSemaphores = new TestSemaphores();
        Semaphore semaphore = new Semaphore(5);

        Runnable runnable = () -> {
            boolean acquired = false;
            try {
                acquired = semaphore.tryAcquire();
                if (acquired) {
                    System.out.println("Semaphore acquired, going to sleep");
                    TimeUnit.MILLISECONDS.sleep(1000);
                } else {
                    System.out.println("could not acquire semaphore");
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (acquired) {
                    semaphore.release();
                }
            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            executorService.submit(runnable);
            sleep(100);
        }
        
        stop(executorService);
    }

}
