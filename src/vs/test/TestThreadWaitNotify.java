package vs.test;

public class TestThreadWaitNotify {

    public static void main(String[] args) {
        Message msg = new Message();
        
        Thread waiter1 = new Thread(new Waiter(msg));
        Thread waiter2 = new Thread(new Waiter(msg));
        
        Thread notifier1 = new Thread(new Notifier(msg));

        waiter1.start();
        waiter2.start();
        notifier1.start();
    }


}

class Message {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting to get notified at time " + System.currentTimeMillis());
                message.wait();
                System.out.println(Thread.currentThread().getName() + " got notified at time " + System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName() + " message " + message.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (message) {
            System.out.println(Thread.currentThread().getName() + " setting message at time " + System.currentTimeMillis());
            message.setMsg("hello world");
            message.notifyAll();
        }

    }
}