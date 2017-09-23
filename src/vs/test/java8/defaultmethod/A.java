package vs.test.java8.defaultmethod;

public interface A {

    default void method1() {
        System.out.println("method 1");
    }

    default void method2() {
        System.out.println("method 2");
    }

    void method3();

}
