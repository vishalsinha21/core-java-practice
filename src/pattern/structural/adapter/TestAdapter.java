package pattern.structural.adapter;

public class TestAdapter {

    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter();
        
        duck.fly();
        duck.quack();
        
        Turkey turkey = new DuckAdapter();
        turkey.fly();
        turkey.gobble();
        
        int i = 5;
        
        printInt(i);
    }

    public static void printInt(int i) {
        System.out.println("printing:: " + i);
    }
    
}
