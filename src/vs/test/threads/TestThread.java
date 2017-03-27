package vs.test.threads;

public class TestThread {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddThread());

        evenThread.start();
        oddThread.start();
    }
}

class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}




