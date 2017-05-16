package vs.test.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<Payload> queue = new ArrayBlockingQueue<Payload>(1);
        Thread producer = new Thread(new Producer(queue), "producer");
        Thread consumer = new Thread(new Consumer(queue), "consumer");

        producer.start();
        consumer.start();
    }
}

class Payload {
    private String message;

    public Payload(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class Producer implements Runnable {

    private BlockingQueue<Payload> queue;

    public Producer(BlockingQueue<Payload> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                String message = "message" + i;
                queue.put(new Payload(message));
                System.out.println("producing message: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {

    private BlockingQueue<Payload> queue;

    public Consumer(BlockingQueue<Payload> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                Payload payload = queue.take();
                System.out.println("consuming message: " + payload.getMessage());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}