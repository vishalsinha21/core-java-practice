package pattern.behavioral.interpreter;

public class InterpreterContext {

    public String getBinary(Integer integer) {
        return Integer.toBinaryString(integer);
    }

    public String getHexa(Integer integer) {
        return Integer.toHexString(integer);
    }

}
