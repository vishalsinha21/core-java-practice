package vs.test;

public class TestMethodCalls {

    {
        System.out.println("Block");
    }

    static {
        System.out.println("Static Block");
    }

    public TestMethodCalls() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        TestMethodCalls test = new TestMethodCalls();

        System.out.println(test.hashCode());
        
        System.out.println("A".hashCode());
        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        System.out.println("B".hashCode());
    }
}
