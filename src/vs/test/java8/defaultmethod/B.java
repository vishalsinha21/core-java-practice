package vs.test.java8.defaultmethod;

public interface B {

    default void method1() {
        System.out.println("B method 1");
    }

    default void method2() {
        System.out.println("B method 2");
    }

    void method3();

}
