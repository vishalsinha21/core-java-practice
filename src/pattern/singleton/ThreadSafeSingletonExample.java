package pattern.singleton;

public class ThreadSafeSingletonExample {

    private static ThreadSafeSingletonExample instance;

    private ThreadSafeSingletonExample() {
        
    }
    
    public static ThreadSafeSingletonExample getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonExample.class) {
                instance = new ThreadSafeSingletonExample();
            }
        }
        
        return instance;
        
    }
}
