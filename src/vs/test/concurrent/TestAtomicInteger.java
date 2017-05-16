package vs.test.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {

    public static void main(String[] args) {
        Count count = new Count(new AtomicInteger(500));
        
        Thread t1 = new Thread(new Increment(count));
        Thread t2 = new Thread(new Increment(count));
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count.getCount());
    }

    
}

class Count {
    private AtomicInteger count;

    public Count(AtomicInteger count) {
        this.count = count;
    }

    public AtomicInteger getCount() {
        return count;
    }

    public void setCount(AtomicInteger count) {
        this.count = count;
    }

    public void increment() {
        count.incrementAndGet();
    }
}

class Increment implements Runnable {

    private Count counter;

    public Increment(Count counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
