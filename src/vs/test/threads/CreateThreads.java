package vs.test.threads;

import java.util.stream.IntStream;

public class CreateThreads {

    public static void main(String[] args) {
        usingRunnableInterface();
        byExtendingThreadClass();
    }

    private static void byExtendingThreadClass() {
        new SimpleThread().start();
    }

    private static void usingRunnableInterface() {
        Thread t1 = new Thread(() -> {
            IntStream.range(0, 100).filter(i -> i % 2 == 0).forEach(i -> System.out.println(Thread.currentThread().getName() + ":" + i));
        });
        Thread t2 = new Thread(() -> {
            IntStream.range(0, 100).filter(i -> i % 2 == 1).forEach(i -> System.out.println(Thread.currentThread().getName() + ":" + i));
        });

        t1.start();
        t2.start();
    }
}


class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("hello world");
    }

}