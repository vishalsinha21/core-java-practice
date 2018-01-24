package oops;

public class TestOverriding {

    public static void main(String[] args) {

        Base base1 = new Derived1();

        Base base2 = new Derived2();

    }

}

class Base {

    public Base() {
        method1();
    }

    public void method1() {
        System.out.println("Base");
    }

}

class Derived1 extends Base {

    public Derived1() {
        super();
    }

    public void method1(String str) {
        System.out.println("Derived 1");
    }

    public void method2() {
        System.out.println("Derived 1");
    }
}

class Derived2 extends Base {
    public void method1() {
        System.out.println("Derived 2");
    }
}