package vs.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

import static vs.test.concurrent.ConcurrentUtils.stop;

public class TestSync {

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    AtomicInteger atomicInteger = new AtomicInteger(0);
    LongAdder longAdder = new LongAdder();

    public static void main(String[] args) {
        TestSync testSync = new TestSync();

        ExecutorService es = Executors.newFixedThreadPool(5);

        IntStream.range(0, 10000).forEach(i -> es.submit(() -> testSync.incrementCount()));
        IntStream.range(0, 10000).forEach(i -> es.submit(() -> testSync.incrementCountSyncMethod()));
        IntStream.range(0, 10000).forEach(i -> es.submit(() -> testSync.incrementCountWithSyncBlock()));
        IntStream.range(0, 10000).forEach(i -> es.submit(() -> testSync.incrementAtomic()));
        IntStream.range(0, 10000).forEach(i -> es.submit(() -> testSync.incrementLongAdder()));

        stop(es);
        
        System.out.println("count1: " + testSync.count1); //not 10000
        System.out.println("count2: " + testSync.count2); //10000
        System.out.println("count3: " + testSync.count3); //10000
        System.out.println("Atomic Integer: " + testSync.atomicInteger.get()); //10000
        System.out.println("Long Adder Integer: " + testSync.longAdder.sumThenReset()); //10000
        System.out.println("Long Adder Integer: " + testSync.longAdder.sumThenReset()); //0
    }

    private void incrementCountWithSyncBlock() {
        synchronized (this) {
            count3++;
        }
    }

    private synchronized void incrementCountSyncMethod() {
        count2++;
    }

    private void incrementCount() {
        count1++;
    }

    private void incrementAtomic() {
        atomicInteger.incrementAndGet();
    }

    private void incrementLongAdder() {
        longAdder.increment();
    }

}

