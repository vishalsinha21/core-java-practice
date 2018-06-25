package vs.test.generics;

public class TestSummation {

    public static void main(String[] args) {
        GenericsSummation<Integer> integerGenericsSummation = new GenericsSummation<>();
        Number sum1 = integerGenericsSummation.sum(Integer.valueOf(1), Integer.valueOf(2));
        System.out.println(sum1);

        GenericsSummation<Double> doubleGenericsSummation = new GenericsSummation<>();
        Number sum2 = doubleGenericsSummation.sum(Double.valueOf(1.1), Double.valueOf(2.3));
        System.out.println(sum2);

    }
}
