package vs.test.threads;

public class TestSyncMethod {

    public static void main(String[] args) {
        Table table = new Table();
        Thread thread1 = new Thread(new MyTableThread(table, 5));
        Thread thread2 = new Thread(new MyTableThread(table, 100));

        thread1.start();
        thread2.start();
    }

}

class Table {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(n * i + " ");
        }
    }
}

class MyTableThread implements Runnable {

    private Table table;
    private int n;

    public MyTableThread(Table table, int n) {
        this.table = table;
        this.n = n;
    }

    @Override
    public void run() {
        table.printTable(n);
    }
}
