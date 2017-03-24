package vs.test;

public class OddEvenUsingThread {

    public static void main(String[] args) {
        MyCounter counter = new MyCounter();

        Thread t1 = new Thread(new Odd(counter), "Odd");
        Thread t2 = new Thread(new Even(counter), "Even");

        t1.start();
        t2.start();
    }
}

class MyCounter {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}

class Odd implements Runnable {

    private MyCounter counter;

    public Odd(MyCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 1) {
                    synchronized (counter) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                        System.out.println(Thread.currentThread().getName() + ":" + "waiting" + ":" + i);
                        counter.wait();
                        System.out.println(Thread.currentThread().getName() + ":" + "notifying" + ":" + i);
                        counter.notifyAll();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Even implements Runnable {

    private MyCounter counter;

    public Even(MyCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    synchronized (counter) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                        System.out.println(Thread.currentThread().getName() + ":" + "notifying" + ":" + i);
                        counter.notifyAll();
                        System.out.println(Thread.currentThread().getName() + ":" + "waiting" + ":" + i);
                        counter.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}