package vs.test.threads;

/**
 * Created by vishalsinha on 3/19/17.
 */
public class TestSyncMethod {

    public static void main(String[] args) {
        Table table = new Table();
        MyTableThread thread1 = new MyTableThread(table, 5);
        MyTableThread thread2 = new MyTableThread(table, 100);
        
        thread1.start();
        thread2.start();
    }
    
}

class Table {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(n*i);
        }
    }
}

class MyTableThread extends Thread {

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
