package vs.test;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("calling finalize for: " + Thread.currentThread().getName());
    }
}

public class TestFinalize {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread(new MyRunnable()).start();
        }

        //this makes sure gc is called, but it has other side effects, gc might reclaim some objects which are still being used
        Runtime.runFinalizersOnExit(true);

        //this does not guarantee that finalize will be called
        Runtime.getRuntime().runFinalization();
    }

}
