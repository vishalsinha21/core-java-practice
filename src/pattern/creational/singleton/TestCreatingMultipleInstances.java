package pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class TestCreatingMultipleInstances {

    public static void main(String[] args) {

        tryCreatingMultipleInstanceForEager();
        tryCreatingMultipleInstanceForLazy();
        tryCreatingMultipleInstanceForBillPugh();
    }

    private static void tryCreatingMultipleInstanceForEager() {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = null;

        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("instance1:: " + instance1);
        System.out.println("instance2:: " + instance2);
    }

    private static void tryCreatingMultipleInstanceForLazy() {
        LazySingletonExample instance1 = LazySingletonExample.getInstance();
        LazySingletonExample instance2 = null;

        Constructor<?>[] constructors = LazySingletonExample.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (LazySingletonExample) constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("instance1:: " + instance1);
        System.out.println("instance2:: " + instance2);
    }

    private static void tryCreatingMultipleInstanceForBillPugh() {
        BillPughSingleton instance1 = BillPughSingleton.SingletonHelper.getInstance();
        BillPughSingleton instance2 = null;

        Constructor<?>[] constructors = BillPughSingleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (BillPughSingleton) constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("instance1:: " + instance1);
        System.out.println("instance2:: " + instance2);
    }
}
