package pattern.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }
    
    public static class SingletonHelper {
        
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        
        public static BillPughSingleton getInstance() {
            return INSTANCE;
        }
    }
}
