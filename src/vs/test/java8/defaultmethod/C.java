package vs.test.java8.defaultmethod;

public class C implements A, B {

    @Override
    public void method1() {
        A.super.method1();
    }

    @Override
    public void method2() {
        System.out.println("C method 2, overridden");
    }

    @Override
    public void method3() {

    }


    public static void main(String[] args) {
        new C().method1();
    }
}
