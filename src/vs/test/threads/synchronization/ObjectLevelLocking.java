package vs.test.threads.synchronization;

import java.time.Duration;
import java.time.Instant;

public class ObjectLevelLocking {

    public static void main(String[] args) {
        Instant start = Instant.now();
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Incrementer(counter));
        Thread thread2 = new Thread(new Incrementer(counter));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
        Instant end = Instant.now();
        System.out.println("time taken: " + Duration.between(start, end).toMillis());
    }
}

class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void increment() {
        try {
            count++;
            Thread.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Incrementer implements Runnable {

    private Counter counter;

    public Incrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}