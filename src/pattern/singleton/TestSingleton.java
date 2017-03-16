package pattern.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        testBillPughSingleton();
        testLazySingleton();
        testEagerSingleton();
    }

    private static void testBillPughSingleton() {
        BillPughSingleton instance1 = BillPughSingleton.SingletonHelper.getInstance();
        System.out.println(instance1);

        BillPughSingleton instance2 = BillPughSingleton.SingletonHelper.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
    
    private static void testEagerSingleton() {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        System.out.println(instance1);

        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
    
    private static void testLazySingleton() {
        LazySingletonExample instance1 = LazySingletonExample.getInstance();
        System.out.println(instance1);

        LazySingletonExample instance2 = LazySingletonExample.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }

}
