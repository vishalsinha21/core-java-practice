package pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class TestCreatingMultipleInstances {

    public static void main(String[] args) {

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
}
