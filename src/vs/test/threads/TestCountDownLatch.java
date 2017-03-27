package vs.test.threads;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Thread cacheService = new Thread(new Service(latch), "cacheService");
        Thread alertService = new Thread(new Service(latch), "alertService");
        Thread validationService = new Thread(new Service(latch), "validationService");

        cacheService.start();
        alertService.start();
        validationService.start();
        
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All services are up!");
    }
}

class Service implements Runnable {
    
    private CountDownLatch latch;

    public Service(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " is up!");
        latch.countDown();
    }
}