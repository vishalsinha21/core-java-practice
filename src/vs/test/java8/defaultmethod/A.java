package vs.test.java8.defaultmethod;

public interface A {

    default void method1() {
        System.out.println("A method 1");
    }

    default void method2() {
        System.out.println("A method 2");
    }

    void method3();

}
