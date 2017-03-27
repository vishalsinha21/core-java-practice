package vs.test.threads;

public class TestSynchronization {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Incrementer(counter));
        Thread thread2 = new Thread(new Decrementer(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());
    }
}

class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void incrementCount() {
        count++;
    }

    public synchronized void decrementCount() {
        count--;
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
            counter.incrementCount();
        }
    }
}

class Decrementer implements Runnable {

    private Counter counter;

    public Decrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrementCount();
        }
    }
}