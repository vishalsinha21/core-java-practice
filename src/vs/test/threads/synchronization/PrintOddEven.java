package vs.test.threads.synchronization;

public class PrintOddEven {

    public static void main(String[] args) {
        MyLock lock = new MyLock(false);

        Thread oddThread = new Thread(new Odd(lock));
        Thread evenThread = new Thread(new Even(lock));

        oddThread.start();
        evenThread.start();
    }
}

class MyLock {

    private boolean oddPrinted;

    public MyLock(boolean oddPrinted) {
        this.oddPrinted = oddPrinted;
    }

    public boolean isOddPrinted() {
        return oddPrinted;
    }

    public void setOddPrinted(boolean oddPrinted) {
        this.oddPrinted = oddPrinted;
    }
}

class Odd implements Runnable {

    private MyLock lock;

    public Odd(MyLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            for (int i = 1; i <= 10; i += 2) {
                if (lock.isOddPrinted()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
                lock.setOddPrinted(true);
                lock.notifyAll();
            }
        }

    }
}

class Even implements Runnable {

    private MyLock lock;

    public Even(MyLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 2; i <= 10; i += 2) {
                if (!lock.isOddPrinted()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
                lock.setOddPrinted(false);
                lock.notifyAll();
            }
        }
    }
}