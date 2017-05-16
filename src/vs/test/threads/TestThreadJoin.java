package vs.test.threads;

public class TestThreadJoin {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        startAndCompleteThread(t1);
        startAndCompleteThread(t2);
        startAndCompleteThread(t3);

        System.out.println("main thread ends");
    }

    private static void startAndCompleteThread(Thread thread) {
        //start thread
        thread.start();
        try {
            //make sure thread ends first
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread starts");
        doHeavyProcessing();
        System.out.println(Thread.currentThread().getName() + " Thread ends");
    }

    private void doHeavyProcessing() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}