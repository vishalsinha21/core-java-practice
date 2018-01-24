package oops.main;

public class Test5 extends WithMain {

    public static void main(String[] args) {
        System.out.println("child main");
    }

}

class WithMain {

    public static void main(String[] args) {
        System.out.println("parent main");
    }

}