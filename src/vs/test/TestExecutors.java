package vs.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutors {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new WorkerThread(i+""));
        }
        
        
        executorService.shutdown();
        while(!executorService.isTerminated()) {
            
        }

        System.out.println("all threads finished");
    }

}


class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "starts: command:" + command);
        processCommand();
        System.out.println(name + "ends: command:" + command);
    }

    private void processCommand() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}