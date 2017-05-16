package vs.test.java8;

public class TestLambdas {

    public static void main(String[] args) {
        
        MathOperation adder = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        MathOperation java8Adder1 = (int a, int b) -> a + b;
        MathOperation java8Adder2 = (a, b) -> a + b;
        MathOperation java8Adder3 = (a, b) -> { return a + b;};

        System.out.println("sum: " + adder.operate(1, 2));
        System.out.println("sum: " + java8Adder1.operate(1, 2));
        System.out.println("sum: " + java8Adder2.operate(1, 2));
        System.out.println("sum: " + java8Adder3.operate(1, 2));
        
        
        SingleVariableOperation multiplier =  new SingleVariableOperation() {
            @Override
            public int operate(int a) {
                return a * 2;
            }
        };

        SingleVariableOperation java8Multiplier1 = (a) -> a * 2;
        SingleVariableOperation java8Multiplier2 = a -> a * 2;
        SingleVariableOperation java8Multiplier3 = a -> { return a * 2; } ;

        System.out.println("result: " + multiplier.operate(5));
        System.out.println("result: " + java8Multiplier1.operate(5));
        System.out.println("result: " + java8Multiplier2.operate(5));
        System.out.println("result: " + java8Multiplier3.operate(5));
    }

}

interface MathOperation {
    public int operate(int a, int b);
}

interface SingleVariableOperation {
    public int operate(int a);
}
