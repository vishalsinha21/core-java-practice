package vs.test.generics;

public class GenericsSummation<T extends Number> {

    public Number sum(T num1, T num2) {
        if (num1 instanceof Integer) {
            return Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return Double.valueOf(num1.doubleValue() + num2.doubleValue());
        }

        return null;
    }

}
