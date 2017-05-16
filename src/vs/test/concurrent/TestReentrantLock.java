package vs.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

import static vs.test.concurrent.ConcurrentUtils.stop;

public class TestReentrantLock {

    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        TestReentrantLock testReentrantLock = new TestReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        IntStream.range(0, 10000)
                .forEach(i -> executorService.submit(() -> testReentrantLock.increment()));

        stop(executorService);
        System.out.println("count: " + testReentrantLock.count);
    }

    private void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

}
