package vs.test;

public class TestOddEven {

    public static void main(String[] args) {
        Lock lock = new Lock(true);
        Thread odd = new Thread(new OddPrinter(lock), "OddPrinter");
        Thread even = new Thread(new EvenPrinter(lock), "EvenPrinter");

        odd.start();
        even.start();
    }
}

class Lock {

    private boolean evenPrinted;

    public Lock(boolean evenPrinted) {
        this.evenPrinted = evenPrinted;
    }

    public boolean isEvenPrinted() {
        return evenPrinted;
    }

    public void setEvenPrinted(boolean evenPrinted) {
        this.evenPrinted = evenPrinted;
    }
}

class OddPrinter implements Runnable {

    private Lock lock;

    public OddPrinter(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " starts");
        synchronized (lock) {
            try {
                for (int i = 1; i < 10; i += 2) {
                    if (!lock.isEvenPrinted()) {
                        System.out.println(name + " waiting");
                        lock.wait();
                    }

                    System.out.println(i);
                    lock.setEvenPrinted(false);
                    System.out.println(name + " notifying all");
                    lock.notifyAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenPrinter implements Runnable {

    private Lock lock;

    public EvenPrinter(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " starts");
        synchronized (lock) {
            try {

                for (int i = 2; i < 10; i += 2) {
                    if (lock.isEvenPrinted()) {
                        System.out.println(name + " waiting");
                        lock.wait();
                    }

                    System.out.println(i);
                    lock.setEvenPrinted(true);
                    System.out.println(name + " notifying all");
                    lock.notifyAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
