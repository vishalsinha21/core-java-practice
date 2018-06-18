package pattern.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (RuntimeException ex) {
            System.out.println("runtime exception when creating singleton: " + ex.getMessage());
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
