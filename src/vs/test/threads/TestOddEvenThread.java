package vs.test.threads;

public class TestOddEvenThread {

    public static void main(String[] args) {
        Printer printer = new Printer(false, true);
        Thread odd = new Thread(new OddPrint(printer), "OddPrinter");
        Thread even = new Thread(new EvenPrint(printer), "EvenPrinter");

        odd.start();
        even.start();
    }
}

class Printer {

    private boolean oddPrinted;
    private boolean evenPrinted;

    public Printer(boolean oddPrinted, boolean evenPrinted) {
        this.oddPrinted = oddPrinted;
        this.evenPrinted = evenPrinted;
    }

    public boolean isOddPrinted() {
        return oddPrinted;
    }

    public void setOddPrinted(boolean oddPrinted) {
        this.oddPrinted = oddPrinted;
    }

    public boolean isEvenPrinted() {
        return evenPrinted;
    }

    public void setEvenPrinted(boolean evenPrinted) {
        this.evenPrinted = evenPrinted;
    }
}

class OddPrint implements Runnable {

    private Printer printer;

    public OddPrint(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " starts");
        synchronized (printer) {
            try {
                for (int i = 1; i < 10; i += 2) {
                    if (printer.isOddPrinted()) {
                        System.out.println(name + " waiting");
                        printer.wait();
                    }

                    System.out.println(name + ":" + i);
                    printer.setOddPrinted(true);
                    printer.setEvenPrinted(false);
                    System.out.println(name + " notifying all");
                    printer.notifyAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenPrint implements Runnable {

    private Printer printer;

    public EvenPrint(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " starts");
        synchronized (printer) {
            try {

                for (int i = 2; i < 10; i += 2) {
                    if (printer.isEvenPrinted()) {
                        System.out.println(name + " waiting");
                        printer.wait();
                    }

                    System.out.println(name + ":" + i);
                    printer.setEvenPrinted(true);
                    printer.setOddPrinted(false);
                    System.out.println(name + " notifying all");
                    printer.notifyAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
